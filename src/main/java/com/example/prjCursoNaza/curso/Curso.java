package com.example.prjCursoNaza.curso;

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
@Table(name="cursos")
@Data
public class Curso extends BaseEntity {
    
    private String titulo;

    private int creditos;


}
