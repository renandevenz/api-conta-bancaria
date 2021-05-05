package com.apibanco.cadastro.output.repository;

import com.apibanco.cadastro.output.model.ContaDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends MongoRepository<ContaDocument, String> {

    ContaDocument findByCpf(String cpf);
}
