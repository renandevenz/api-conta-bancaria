package com.apibanco.cadastro.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ResourceException extends RuntimeException {

    public ResourceException(String message) {
        super(message);
    }
}
