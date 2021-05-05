package com.apibanco.cadastro.output.adapter;

import com.apibanco.cadastro.application.port.AberturaContaPort;
import com.apibanco.cadastro.output.model.ContaDocument;
import com.apibanco.cadastro.output.repository.ContaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AberturaContaAdapter implements AberturaContaPort {

    private final ContaRepository repository;

    @Override
    public void readConta(ContaDocument contaDocument) {

        repository.save(contaDocument);
    }
}
