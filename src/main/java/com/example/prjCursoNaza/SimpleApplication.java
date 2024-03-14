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
import com.example.prjCursoNaza.matricula.Matricula;
import com.example.prjCursoNaza.matricula.MatriculaRepository;

import lombok.extern.slf4j.Slf4j;


@SpringBootApplication   //(scanBasePackages = {"com.example"})
@Slf4j
public class SimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleApplication.class, args);
	}


	@Bean
	public CommandLineRunner initializeDatabase(CursoRepository cursoRepository,
	                                            EstudanteRepository estudanteRepository,
	                                            MatriculaRepository matriculaRepository) {
	    return args -> {
	        // Carregar cursos
	        Curso curso1 = new Curso("Curso 1", 6, null);
	        Curso curso2 = new Curso("Curso 2", 4, null);
	        Curso curso3 = new Curso("Curso 3", 20, null);
	        cursoRepository.save(curso1);
	        cursoRepository.save(curso2);
	        cursoRepository.save(curso3);

	        // Carregar estudantes
	    	Estudante estudante1 = new Estudante("Estudante 1", LocalDate.of(2024, 3, 2),null);
			Estudante estudante2 = new Estudante("Estudante 2", LocalDate.of(2024, 3, 9), null);
			Estudante estudante3 = new Estudante("Estudante 3", LocalDate.of(2024, 3, 11), null);
			Estudante estudante4 = new Estudante("Estudante 4", LocalDate.of(2024, 3, 12), null);
			Estudante estudante5 = new Estudante("Estudante 5", LocalDate.of(2024, 3, 13), null);
			Estudante estudante6 = new Estudante("Estudante 6", LocalDate.of(2024, 3, 13), null);
	        estudanteRepository.save(estudante1);
	        estudanteRepository.save(estudante2);
	        estudanteRepository.save(estudante3);
			estudanteRepository.save(estudante4);
	        estudanteRepository.save(estudante5);
	        estudanteRepository.save(estudante6);

	        // Carregar e associar matrículas aos cursos e estudantes
	        Matricula matricula1 = new Matricula(curso1.getId(), estudante1.getId());
	        Matricula matricula2 = new Matricula(curso2.getId(), estudante2.getId());
	        Matricula matricula3 = new Matricula(curso2.getId(), estudante3.getId());
			Matricula matricula4 = new Matricula(curso3.getId(), estudante4.getId());
	        Matricula matricula5 = new Matricula(curso3.getId(), estudante5.getId());
	        Matricula matricula6 = new Matricula(curso3.getId(), estudante6.getId());
	        matriculaRepository.save(matricula1);
	        matriculaRepository.save(matricula2);
	        matriculaRepository.save(matricula3);
			matriculaRepository.save(matricula4);
	        matriculaRepository.save(matricula5);
	        matriculaRepository.save(matricula6);

	        // Atualizar as listas de matrículas nos cursos e estudantes correspondentes
	        curso1.addMatricula(matricula1);
	        curso2.addMatricula(matricula2);
			curso2.addMatricula(matricula3);
	        curso3.addMatricula(matricula4);
			curso3.addMatricula(matricula5);
			curso3.addMatricula(matricula6);

	        estudante1.addMatricula(matricula1);
	        estudante2.addMatricula(matricula2);
	        estudante3.addMatricula(matricula3);
			estudante4.addMatricula(matricula4);
	        estudante5.addMatricula(matricula5);
	        estudante6.addMatricula(matricula6);

	        // Salvar as atualizações nos repositórios
	        cursoRepository.save(curso1);
	        cursoRepository.save(curso2);
	        cursoRepository.save(curso3);

	        estudanteRepository.save(estudante1);
	        estudanteRepository.save(estudante2);
	        estudanteRepository.save(estudante3);
			estudanteRepository.save(estudante4);
	        estudanteRepository.save(estudante5);
	        estudanteRepository.save(estudante6);
	    };
	}
}
