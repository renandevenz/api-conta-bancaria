package com.apibanco.cadastro.application.service;

import com.apibanco.cadastro.application.port.CadastroContaEntityPort;
import com.apibanco.cadastro.application.usecase.CadastroContaUseCase;
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
public class CadastroContaService implements CadastroContaUseCase {

    private final CadastroContaEntityPort aberturaContaPort;

    @Override
    public Conta cadastrarConta(Conta conta) {

        log.info("Conta processada: " + conta);

        return Optional.ofNullable(aberturaContaPort.processar(conta))
                .orElseThrow(ResourceException::new);
    }

    @Override
    public ContaDocument cadastrarContaEntity(Conta conta) {

        try {
            log.info("Conta salva no banco de dados: " + conta);
            return aberturaContaPort.salvarContaEntity(conta);
        } catch (Exception e) {
            log.severe(e.getMessage());
            throw new ResourceException(ExceptionEnum.MESSAGE.getMessage());
        }
    }
}
