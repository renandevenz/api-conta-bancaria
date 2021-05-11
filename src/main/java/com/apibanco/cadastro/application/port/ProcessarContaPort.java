package com.apibanco.cadastro.application.port;

import com.apibanco.cadastro.domain.Conta;

public interface ProcessarContaPort {

    Conta processar(Conta conta);
}
