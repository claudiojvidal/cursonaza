package com.example.prjCursoNaza;


import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.prjCursoNaza.curso.Curso;
import com.example.prjCursoNaza.curso.CursoRepository;
import com.example.prjCursoNaza.estudante.Estudante;
import com.example.prjCursoNaza.estudante.EstudanteRepository;

import lombok.extern.slf4j.Slf4j;


@SpringBootApplication   //(scanBasePackages = {"com.example"})
@Slf4j
public class SimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleApplication.class, args);
	}

	/* 
	@Bean
	public CommandLineRunner loadDatabase(CursoRepository repository, EstudanteRepository repository1) {
		log.info("Loading data...");
		
		return (args) -> {
			repository.save(new Curso("Curso 1", 6));
			repository.save(new Curso("Curso 2", 4));
			repository.save(new Curso("Curso 3", 20));
			repository1.save(new Estudante("Estudante 1", LocalDate.of(2024, 3, 2)));
			repository1.save(new Estudante("Estudante 2", LocalDate.of(2024, 3, 9)));
			repository1.save(new Estudante("Estudante 3", LocalDate.of(2024, 3, 11)));
			repository1.save(new Estudante("Estudante 3", LocalDate.of(2024, 3, 12)));
		};
	}
   */
	
}
