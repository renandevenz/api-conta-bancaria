package com.apibanco.cadastro.application.port;

import com.apibanco.cadastro.input.dto.SalvarContaDto;

public interface CadastrarContaPort {

    void registrarConta(SalvarContaDto salvarContaDto);
}
