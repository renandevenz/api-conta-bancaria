package com.apibanco.cadastro.exception;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
    public ApiErrors handler(MethodArgumentNotValidException e) {

        BindingResult result = e.getBindingResult();

        return new ApiErrors(result);
    }
}
