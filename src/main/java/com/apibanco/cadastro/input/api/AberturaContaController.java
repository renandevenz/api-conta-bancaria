package com.apibanco.cadastro.input.api;

import com.apibanco.cadastro.domain.Conta;
import com.apibanco.cadastro.input.adapter.AberturaContaControllerAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/conta")
@RequiredArgsConstructor
public class AberturaContaController {

    private final AberturaContaControllerAdapter adapter;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void cadastrarConta(@RequestBody @Valid Conta conta) {

        adapter.registrarConta(conta);
    }
}
