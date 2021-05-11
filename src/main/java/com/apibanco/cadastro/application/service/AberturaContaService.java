package com.apibanco.cadastro.application.service;

import com.apibanco.cadastro.application.port.AberturaContaEntityPort;
import com.apibanco.cadastro.application.port.ProcessarContaPort;
import com.apibanco.cadastro.application.usecase.AberturaContaUseCase;
import com.apibanco.cadastro.domain.Conta;
import com.apibanco.cadastro.exception.ExceptionEnum;
import com.apibanco.cadastro.exception.ResourceException;
import com.apibanco.cadastro.output.model.ContaDocument;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Log
public class AberturaContaService implements AberturaContaUseCase {

    private final AberturaContaEntityPort aberturaContaPort;
    private final ProcessarContaPort processarContaPort;

    @Override
    public Conta cadastrarConta(Conta conta) {

        log.info("Conta processada :" + conta);

       return Optional.ofNullable(processarContaPort.processar(conta))
                .orElseThrow(ResourceException::new);
    }

    @Override
    public ContaDocument cadastrarContaEntity(Conta conta) {

        try {
            log.info("Conta salva no banco de dados :" + conta);
            return aberturaContaPort.salvarContaEntity(conta);
        } catch (Exception e) {
            log.severe(e.getMessage());
            throw new ResourceException(ExceptionEnum.MESSAGE.getMessage());
        }
    }
}
