package com.generation.helloworld1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ola")
public class HelloWorld {
	
	@GetMapping("ola")
	public String olaMundo() {
		return "Hello World";
		
	}
	@GetMapping("ola")
    public String olaMundo2() {
        return "Responsabilidade Pessoal, Orientação ao Futuro, Mentalidade de Crescimento, Persistência";
	}
	@GetMapping("ola")
    public String olaMundo3() {
        return "Gestão de tempo, Orientação aos detalhes, Proatividade";
}
}
