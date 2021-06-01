package com.apibanco.cadastro.input.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CadastroContaRequest {

    private String cpf;

    private String nome;

    private String agencia;

    private String numeroConta;

    private String tipoConta;
}
