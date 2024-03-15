package com.example.prjCursoNaza.curso;

import java.util.List;
import java.util.Objects;

import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/curso")
@Slf4j
public class CursoController {
    
    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping
    public List<Curso> list() {
        log.info("Listining all courses");
        var cursos = cursoRepository.findAll();
        if (log.isDebugEnabled()) {
            log.debug("Cursos found: ", cursos);
        }
        return cursos;
    }

    @GetMapping("/{id}")
    public Curso get(@PathVariable Long id) {
        log.info("Get curso by id: {}", id);

        return cursoRepository.findById(id).get();
    }


    @PostMapping
    public Curso save(@RequestBody Curso curso) {
        log.info("Post curso : {}", curso);

        return cursoRepository.save(curso);
    }

    @PatchMapping
    public Curso update(@RequestBody Curso curso) throws BadRequestException {
        log.info("Update curso : {}", curso.toString());

        if (!Objects.isNull(curso.getId())) {
            throw new BadRequestException();
        }

        return cursoRepository.save(curso);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        log.info("Delete curso by id: {}", id);

        cursoRepository.deleteById(id);
    }


}
