package com.apibanco.cadastro.input.mapper;

import com.apibanco.cadastro.domain.Conta;
import com.apibanco.cadastro.domain.TipoConta;
import com.apibanco.cadastro.input.dto.CadastroContaRequest;
import com.apibanco.cadastro.input.dto.SalvarContaDto;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

@Component
@Log
public class CadastroContaRequestMapper {

    public Conta convert(SalvarContaDto contaDto) {

        Conta conta = Conta.builder()
                .agencia(contaDto.getAgencia())
                .numeroConta(contaDto.getNumeroConta())
                .nome(contaDto.getNome())
                .cpf(contaDto.getCpf())
                .tipoConta(TipoConta.CC)
                .build();

        log.info("Mapeamento do objeto json para o dominio: " + conta);

        return conta;
    }

    public CadastroContaRequest convertToDto(Conta conta) {

        CadastroContaRequest request = CadastroContaRequest.builder()
                .agencia(conta.getAgencia())
                .numeroConta(conta.getNumeroConta())
                .nome(conta.getNome())
                .cpf(conta.getCpf())
                .tipoConta(TipoConta.CC.getTipo())
                .build();

        log.info("Mapeamento do objeto json para o dto: " + request);

        return request;
    }
}
