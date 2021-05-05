package com.apibanco.cadastro.output.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TipoConta {

    CC("CC"), // Conta corrente
    CP("CP"); // Conta poupança

    private String tipo;
}
