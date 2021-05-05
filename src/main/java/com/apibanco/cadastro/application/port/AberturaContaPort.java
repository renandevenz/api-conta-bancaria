package com.apibanco.cadastro.application.port;

import com.apibanco.cadastro.output.model.ContaDocument;

public interface AberturaContaPort {

    void readConta(ContaDocument contaDocument);
}
