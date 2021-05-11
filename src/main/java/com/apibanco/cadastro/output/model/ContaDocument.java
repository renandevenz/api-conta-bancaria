package com.apibanco.cadastro.output.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "conta")
public class ContaDocument {

    @Id
    @Indexed
    private String cpf;

    private String nome;

    private String agencia;

    private String numeroConta;

    private String tipoConta;
}
