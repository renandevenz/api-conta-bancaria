package com.apibanco.cadastro.application.port;

import com.apibanco.cadastro.domain.Conta;

public interface CadastrarContaPort {

    void registrarConta(Conta conta);
}
