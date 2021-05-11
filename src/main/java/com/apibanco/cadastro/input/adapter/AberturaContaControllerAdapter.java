package com.apibanco.cadastro.input.adapter;

import com.apibanco.cadastro.application.port.CadastrarContaPort;
import com.apibanco.cadastro.application.usecase.AberturaContaUseCase;
import com.apibanco.cadastro.domain.Conta;
import com.apibanco.cadastro.input.dto.SalvarContaDto;
import com.apibanco.cadastro.input.mapper.AberturaContaRequestMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Log
public class AberturaContaControllerAdapter implements CadastrarContaPort {

    private final AberturaContaRequestMapper mapper;
    private final AberturaContaUseCase useCase;

    @Override
    public void registrarConta(SalvarContaDto salvarContaDto) {

        Conta conta = mapper.convert(salvarContaDto);
        Conta salvarConta = useCase.cadastrarConta(conta);
        mapper.convertToDto(salvarConta);

        log.info("Inicio do processamento do cadastro da conta: " + salvarConta);
    }
}
