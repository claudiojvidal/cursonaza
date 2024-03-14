package com.example.prjCursoNaza.estudante;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.prjCursoNaza.matricula.Matricula;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
class BaseEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
}


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="estudantes")
@Data
public class Estudante extends BaseEntity {
    
    private String nome;

    private LocalDate dataMatricula;

    @OneToMany
    private List<Matricula> matriculas;

    public void addMatricula(Matricula matricula) {
        if (matriculas == null) {
            matriculas = new ArrayList<>();
        }
        matriculas.add(matricula);
    }
    
}
