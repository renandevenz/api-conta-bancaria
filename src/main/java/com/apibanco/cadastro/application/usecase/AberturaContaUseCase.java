package com.apibanco.cadastro.application.usecase;

import com.apibanco.cadastro.domain.Conta;
import com.apibanco.cadastro.output.model.ContaDocument;

public interface AberturaContaUseCase {

    Conta cadastrarConta(Conta conta);

    ContaDocument cadastrarContaEntity(Conta conta);
}
