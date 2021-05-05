package com.apibanco.cadastro.output.adapter;

import com.apibanco.cadastro.application.port.AberturaContaEntityPort;
import com.apibanco.cadastro.domain.Conta;
import com.apibanco.cadastro.output.mapper.AberturaContaMapper;
import com.apibanco.cadastro.output.model.ContaDocument;
import com.apibanco.cadastro.output.repository.ContaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AberturaContaAdapter implements AberturaContaEntityPort {

    private final ContaRepository repository;

    @Override
    public void salvarContaEntity(ContaDocument contaDocument) {

        Conta conta = AberturaContaMapper.convertToDomain(contaDocument);
        repository.save(contaDocument);
    }
}
