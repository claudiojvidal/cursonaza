package com.example.prjCursoNaza.matricula;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
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
@Table(name="matriculas")
@Data
public class Matricula extends BaseEntity {
    
    private long idCurso;

    private long idEstudante;


}
