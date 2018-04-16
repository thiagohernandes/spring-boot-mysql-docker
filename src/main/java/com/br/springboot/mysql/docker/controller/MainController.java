package com.br.springboot.mysql.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.springboot.mysql.docker.domain.Pessoa;
import com.br.springboot.mysql.docker.repository.PessoaRepository;

/**
 * Pessoa Controller
 * @author Thiago Hernandes de Souza
 * @since 16-04-2018
 * */

@RestController
@RequestMapping("/api/docker")
public class MainController {
	
	@Autowired
	private PessoaRepository pessoaRepository;

	/** 
	 * Get lista de pessoas from docker compose
	 * @author Thiago Hernandes de Souza
	 * @since 16-04-2018
	 * @return lista de pessoas
	 * */
	@GetMapping(value="/pessoas")
	public List<Pessoa> getListPessoas() {
		return pessoaRepository.findAll();
	}

}
