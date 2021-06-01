package com.apibanco.cadastro.input.api;

import com.apibanco.cadastro.input.adapter.CadastroContaControllerAdapter;
import com.apibanco.cadastro.input.dto.SalvarContaDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/conta")
@RequiredArgsConstructor
@Log
public class CadastroContaController {

    private final CadastroContaControllerAdapter adapter;

    @PostMapping
    public ResponseEntity<SalvarContaDto> cadastrarConta(@RequestBody @Valid SalvarContaDto requestBody) {

        adapter.registrarConta(requestBody);

        log.info("Evento recebido: " + "Payload: " + requestBody);

        return new ResponseEntity<>(requestBody, HttpStatus.CREATED);
    }
}
