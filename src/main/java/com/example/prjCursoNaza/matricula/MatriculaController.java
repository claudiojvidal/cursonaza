package com.example.prjCursoNaza.matricula;

import java.util.List;
import java.util.Objects;

import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/matricula")
@Slf4j
public class MatriculaController {
    
    @Autowired
    private MatriculaRepository matriculaRepository;

    @GetMapping
    public List<Matricula> list() {
        log.info("Listining all applications");
        var matriculas = matriculaRepository.findAll();
        if (log.isDebugEnabled()) {
            log.debug("Matriculas found: ", matriculas);
        }
        return matriculas;
    }

    @GetMapping("/{id}")
    public Matricula get(@PathVariable Long id) {
        log.info("Get matricula by id: {}", id);

        return matriculaRepository.findById(id).get();
    }


    @PostMapping
    public Matricula save(Matricula matricula) throws BadRequestException {
        log.info("Post matricula : {}", matricula);

        if (!Objects.isNull(matricula.getId())) {
            throw new BadRequestException();
        }

        return matriculaRepository.save(matricula);
    }

    @PatchMapping
    public Matricula update(Matricula matricula) throws BadRequestException {
        log.info("Update matricula : {}", matricula);

        if (!Objects.isNull(matricula.getId())) {
            throw new BadRequestException();
        }

        return matriculaRepository.save(matricula);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        log.info("Delete matricula by id: {}", id);

        matriculaRepository.deleteById(id);
    }


}
