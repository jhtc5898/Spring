package com.pruebasjohn.pruebasjohn.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;


@Entity
public class Matriculas {
    @Id
    @GeneratedValue(generator = "increment")
    private String id;  // id de la matricula
    private String idAlumno; // id del alumno
    private String nombre; // fecha de inscripcion
    private String ubicacion; // ubicacion de la matricula
    private String fecha; // fecha de la matricula

    public Matriculas() {
    }

    public Matriculas(String id, String idAlumno, String nombre, String ubicacion, String fecha) {
        this.id = id;
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
    }
}
