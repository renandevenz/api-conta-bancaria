package com.apibanco.cadastro.input.adapter;

import com.apibanco.cadastro.application.port.CadastrarContaPort;
import com.apibanco.cadastro.domain.Conta;
import com.apibanco.cadastro.input.mapper.AberturaContaRequestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AberturaContaControllerAdapter implements CadastrarContaPort {

    private final AberturaContaRequestMapper mapper;

    @Override
    public void registrarConta(Conta conta) {

        mapper.convert(conta);
    }
}
