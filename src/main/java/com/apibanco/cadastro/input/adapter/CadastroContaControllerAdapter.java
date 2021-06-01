package com.apibanco.cadastro.input.adapter;

import com.apibanco.cadastro.application.port.CadastroContaPort;
import com.apibanco.cadastro.application.usecase.CadastroContaUseCase;
import com.apibanco.cadastro.domain.Conta;
import com.apibanco.cadastro.input.dto.SalvarContaDto;
import com.apibanco.cadastro.input.mapper.CadastroContaRequestMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Log
public class CadastroContaControllerAdapter implements CadastroContaPort {

    private final CadastroContaRequestMapper mapper;
    private final CadastroContaUseCase useCase;

    @Override
    public void registrarConta(SalvarContaDto salvarContaDto) {

        Conta conta = mapper.convert(salvarContaDto);
        Conta salvarConta = useCase.cadastrarConta(conta);
        mapper.convertToDto(salvarConta);

        log.info("Inicio do processamento do cadastro da conta: " + salvarConta);
    }
}
