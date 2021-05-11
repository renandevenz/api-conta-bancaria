package com.apibanco.cadastro.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ExceptionEnum {

    MESSAGE("Não foi possível validar o cadastro da conta.");

    private final String message;
}
