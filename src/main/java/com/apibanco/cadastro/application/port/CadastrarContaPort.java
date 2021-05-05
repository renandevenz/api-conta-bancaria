package com.apibanco.cadastro.application.port;

import com.apibanco.cadastro.domain.Conta;
import com.apibanco.cadastro.input.dto.AberturaContaRequest;

public interface CadastrarContaPort {

    AberturaContaRequest registrarConta(Conta conta);
}
