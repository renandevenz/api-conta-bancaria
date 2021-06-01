package com.apibanco.cadastro.input.dto;

import lombok.Data;

@Data
public class SalvarContaDto {

    private String cpf;

    private String nome;

    private String agencia;

    private String numeroConta;

    private String tipoConta;
}
