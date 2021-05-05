package com.apibanco.cadastro.application.port;

import com.apibanco.cadastro.output.model.ContaDocument;

public interface AberturaContaEntityPort {

    void salvarContaEntity(ContaDocument contaDocument);
}
