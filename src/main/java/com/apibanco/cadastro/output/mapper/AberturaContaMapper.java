package com.apibanco.cadastro.output.mapper;

import com.apibanco.cadastro.domain.Conta;
import com.apibanco.cadastro.domain.TipoConta;
import com.apibanco.cadastro.output.model.ContaDocument;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AberturaContaMapper {

    public static ContaDocument convertToEntity(Conta conta) {

        return ContaDocument.builder()
                .agencia(conta.getAgencia())
                .numeroConta(conta.getNumeroConta())
                .cpf(conta.getCpf())
                .nome(conta.getNome())
                .tipoConta(TipoConta.CC.getTipo())
                .build();
    }
}
