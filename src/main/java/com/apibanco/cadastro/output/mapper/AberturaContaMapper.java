package com.apibanco.cadastro.output.mapper;

import com.apibanco.cadastro.domain.Conta;
import com.apibanco.cadastro.output.model.ContaDocument;

public class AberturaContaMapper {

    public static Conta convertToDomain(ContaDocument contaDocument) {

        return Conta.builder()
                .agencia(contaDocument.getAgencia())
                .numeroConta(contaDocument.getNumeroConta())
                .cpf(contaDocument.getCpf())
                .nome(contaDocument.getNome())
                .tipoConta(contaDocument.getTipoConta())
                .build();
    }
}
