package com.apibanco.cadastro.application.service;

import com.apibanco.cadastro.application.port.AberturaContaEntityPort;
import com.apibanco.cadastro.application.port.CadastrarContaPort;
import com.apibanco.cadastro.application.usecase.AberturaContaEntityUseCase;
import com.apibanco.cadastro.application.usecase.CadastrarContaUseCase;
import com.apibanco.cadastro.domain.Conta;
import com.apibanco.cadastro.exception.ExceptionEnum;
import com.apibanco.cadastro.exception.ResourceException;
import com.apibanco.cadastro.output.model.ContaDocument;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log
public class AberturaContaService implements AberturaContaEntityUseCase, CadastrarContaUseCase {

    private final AberturaContaEntityPort aberturaContaPort;
    private final CadastrarContaPort cadastrarContaPort;

    @Override
    public void cadastrarConta(ContaDocument contaDocument) {

        try {
            aberturaContaPort.salvarContaEntity(contaDocument);
        } catch (ResourceException e) {
            log.severe(e.getMessage() + ExceptionEnum.MESSAGE.getMessage());
        }
    }

    @Override
    public void salvarConta(Conta conta) throws ResourceException {

        cadastrarContaPort.registrarConta(conta);
    }
}
