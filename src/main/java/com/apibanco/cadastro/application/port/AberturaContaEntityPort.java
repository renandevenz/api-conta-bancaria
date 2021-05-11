package com.apibanco.cadastro.application.port;

import com.apibanco.cadastro.domain.Conta;
import com.apibanco.cadastro.output.model.ContaDocument;

public interface AberturaContaEntityPort {

    ContaDocument salvarContaEntity(Conta conta);
}
