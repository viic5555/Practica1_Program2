package org.example.models;

import java.util.ArrayList;

public class Titulacion {
    private String nombre;
    private int codigo;
    private long telefono;
    private Facultad facultad;
    private ArrayList<Asignatura> asignaturas;

    public Titulacion() {
    }

    public Titulacion(String nombre, int codigo, Facultad facultad, ArrayList<Asignatura> asignaturas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.facultad = facultad;
        this.asignaturas = asignaturas;
    }

    private static void showAsignaturas(ArrayList<Asignatura> asignaturas) {
        asignaturas.forEach(System.out::println);
    }
}
