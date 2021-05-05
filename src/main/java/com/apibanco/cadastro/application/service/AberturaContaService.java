package com.apibanco.cadastro.application.service;

import com.apibanco.cadastro.application.port.AberturaContaPort;
import com.apibanco.cadastro.application.usecase.AberturaContaUseCase;
import com.apibanco.cadastro.domain.Conta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AberturaContaService implements AberturaContaUseCase {

    private final AberturaContaPort port;

    @Override
    public void cadastrarConta(Conta conta) {

    }
}
