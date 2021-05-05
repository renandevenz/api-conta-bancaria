package com.apibanco.cadastro.domain;

import com.apibanco.cadastro.output.model.TipoConta;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
public class Conta {

        @NotEmpty
        @Size(max = 11)
        private String cpf;

        @NotEmpty
        @Size(max = 50)
        private String nome;

        @NotEmpty
        @Size(max = 5)
        private String agencia;

        @NotEmpty
        @Size(max = 6)
        private String numeroConta;

        @NotEmpty
        private TipoConta tipoConta;
}
