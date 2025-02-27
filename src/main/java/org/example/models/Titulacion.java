package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Titulacion {
    private String nombre;
    private int codigo;
    private long telefono;
    private Facultad facultad;
    private List<Asignatura> asignaturas;

    public Titulacion() {
    }

    public Titulacion(String nombre, int codigo, Facultad facultad, List<Asignatura> asignaturas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.facultad = facultad;
        this.asignaturas = asignaturas;
    }

    private static void showAsignaturas(ArrayList<Asignatura> asignaturas) {
        asignaturas.forEach(System.out::println);
    }
}
