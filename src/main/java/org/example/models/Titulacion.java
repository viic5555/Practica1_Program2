package org.example.models;

import java.util.ArrayList;

public class Titulacion {
    private String nombre;
    private int codigo;
    private long telefono;
    private Facultad facultad;
    private ArrayList<Asignatura> asignaturas;

    public Titulacion(String nombre, int codigo, Facultad facultad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.facultad = facultad;
    }

    /**
     * Lista #5 Asignaturas dentro de una Titulación (no deberían estar repetidas.)
     * @param asignaturas listado de asignaturas
     */
    private static void showAsignaturasTitulacion(ArrayList<Asignatura> asignaturas) {
        asignaturas.forEach(System.out::println);
    }
}
