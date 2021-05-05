package com.apibanco.cadastro.input.mapper;

import com.apibanco.cadastro.domain.Conta;
import com.apibanco.cadastro.input.dto.AberturaContaRequest;

public class AberturaContaRequestMapper {

    public static AberturaContaRequest convert(Conta conta) {

        return AberturaContaRequest.builder()
                .agencia(conta.getAgencia())
                .numeroConta(conta.getNumeroConta())
                .nome(conta.getNome())
                .cpf(conta.getCpf())
                .tipoConta(conta.getTipoConta())
                .build();
    }
}
