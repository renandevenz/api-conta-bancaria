package com.apibanco.cadastro.application.service;

import com.apibanco.cadastro.application.port.AberturaContaEntityPort;
import com.apibanco.cadastro.application.port.CadastrarContaPort;
import com.apibanco.cadastro.application.usecase.AberturaContaEntityUseCase;
import com.apibanco.cadastro.application.usecase.CadastrarContaUseCase;
import com.apibanco.cadastro.domain.Conta;
import com.apibanco.cadastro.output.model.ContaDocument;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AberturaContaService implements AberturaContaEntityUseCase, CadastrarContaUseCase {

    private final AberturaContaEntityPort aberturaContaPort;
    private final CadastrarContaPort cadastrarContaPort;

    @Override
    public void cadastrarConta(ContaDocument contaDocument) {

        aberturaContaPort.salvarContaEntity(contaDocument);
    }

    @Override
    public void salvarConta(Conta conta) {

        cadastrarContaPort.registrarConta(conta);
    }
}
