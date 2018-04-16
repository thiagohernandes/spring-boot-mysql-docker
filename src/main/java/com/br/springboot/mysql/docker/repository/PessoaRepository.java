package com.br.springboot.mysql.docker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.springboot.mysql.docker.domain.Pessoa;

/**
 * Repository Persistência - Pessoa
 * @author Thiago Hernandes de Souza
 * @since 16-04-2018
 * */

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
