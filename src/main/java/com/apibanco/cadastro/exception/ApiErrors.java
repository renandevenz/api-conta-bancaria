package com.apibanco.cadastro.exception;

import org.springframework.validation.BindingResult;

import java.util.ArrayList;
import java.util.List;

public class ApiErrors {

    private final List<String> errors;

    public ApiErrors(BindingResult result) {

        this.errors = new ArrayList<>();
        result.getAllErrors()
                .forEach(er -> this.errors.add(er.getDefaultMessage()));
    }
}
