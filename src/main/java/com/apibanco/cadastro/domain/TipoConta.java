package com.apibanco.cadastro.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum TipoConta {

    CC("CC", "Conta corrente"),
    CP("CP", "Conta poupança");

    private final String tipo;
    private final String desc;
}
