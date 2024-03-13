package com.example.prjCursoNaza.estudante;

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
@RequestMapping("/estudante")
@Slf4j
public class EstudanteController {
    
    @Autowired
    private EstudanteRepository estudanteRepository;

    @GetMapping
    public List<Estudante> list() {
        log.info("Listining all students");
        var estudantes = estudanteRepository.findAll();
        if (log.isDebugEnabled()) {
            log.debug("estudantes found: ", estudantes);
        }
        return estudantes;
    }

    @GetMapping("/{id}")
    public Estudante get(@PathVariable Long id) {
        log.info("Get estudante by id: {}", id);

        return estudanteRepository.findById(id).get();
    }


    @PostMapping
    public Estudante save(Estudante estudante) throws BadRequestException {
        log.info("Post estudante : {}", estudante);

        if (!Objects.isNull(estudante.getId())) {
            throw new BadRequestException();
        }

        return estudanteRepository.save(estudante);
    }

    @PatchMapping
    public Estudante update(Estudante estudante) throws BadRequestException {
        log.info("Update estudante : {}", estudante);

        if (!Objects.isNull(estudante.getId())) {
            throw new BadRequestException();
        }

        return estudanteRepository.save(estudante);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        log.info("Delete estudante by id: {}", id);

        estudanteRepository.deleteById(id);
    }


}
