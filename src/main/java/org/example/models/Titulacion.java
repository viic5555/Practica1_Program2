package org.example.models;

import java.util.List;

public class Titulacion {
    private String nombre;
    private int codigo;
    private String facultad;
    private List<Asignatura> asignaturas;

    public Titulacion() {
    }

    public Titulacion(String nombre, int codigo, String facultad, List<Asignatura> asignaturas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.facultad = facultad;
        this.asignaturas = asignaturas;
    }
}
