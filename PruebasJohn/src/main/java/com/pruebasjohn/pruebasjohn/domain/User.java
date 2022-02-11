package com.pruebasjohn.pruebasjohn.domain;

import org.springframework.boot.autoconfigure.AutoConfigureOrder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Todos los entity permite crear un campo en la base de datos
@Entity
public class User {
    //Agrego la cedula valor claves

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cedula;
    private String nombre;

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
