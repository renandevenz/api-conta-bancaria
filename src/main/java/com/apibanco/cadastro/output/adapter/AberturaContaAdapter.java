package com.apibanco.cadastro.output.adapter;

import com.apibanco.cadastro.application.port.CadastroContaEntityPort;
import com.apibanco.cadastro.domain.Conta;
import com.apibanco.cadastro.output.mapper.AberturaContaMapper;
import com.apibanco.cadastro.output.model.ContaDocument;
import com.apibanco.cadastro.output.repository.ContaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AberturaContaAdapter implements CadastroContaEntityPort {

    private final ContaRepository repository;

    @Override
    public Conta processar(Conta conta) {

        ContaDocument contaDocument = AberturaContaMapper.convertToEntity(conta);
        ContaDocument savedContaDocument = repository.save(contaDocument);

        return AberturaContaMapper.convertToDomain(savedContaDocument);
    }

    @Override
    public ContaDocument salvarContaEntity(Conta conta) {

        ContaDocument contaDocument = AberturaContaMapper.convertToEntity(conta);

        return repository.save(contaDocument);
    }
}
