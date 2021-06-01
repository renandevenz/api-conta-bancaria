package com.apibanco.cadastro.application.port;

import com.apibanco.cadastro.input.dto.SalvarContaDto;

public interface CadastroContaPort {

    void registrarConta(SalvarContaDto salvarContaDto);
}
