package com.apibanco.cadastro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.apibanco"})
public class ApiContaBancariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiContaBancariaApplication.class, args);
	}

}
