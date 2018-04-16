package com.br.springboot.mysql.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** 
 * Classe principal de execução da aplicação
 * @author Thiago Hernandes de Souza
 * @since 16-04-2018
 * */

@SpringBootApplication
public class SpringBootMysqlDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMysqlDockerApplication.class, args);
	}
}
