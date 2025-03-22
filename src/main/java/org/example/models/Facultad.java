package org.example.models;

import java.util.ArrayList;

/**
 * Facultad.java
 * Version 1.0 22/03/2025 Victor Martin
 */
public class Facultad {
    private String nombre;
    private int codigo;
    private long telefono;
    public ArrayList<Titulacion> titulaciones = new ArrayList<>();
    private ArrayList<Profesor> profesores = new ArrayList<>(); // Nueva lista

    public Facultad(String nombre, int codigo, long telefono) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.telefono = telefono;
    }

    /**
     *  Lista #2, lista de asignaturas que imparte cada profesor.
     */
    public void listarAsignaturasPorProfesor() {
        for (Profesor profesor : profesores) {
            System.out.println("Profesor: " + profesor.getNombre());
            System.out.println("Asignaturas:");
            for (Asignatura asignatura : profesor.getAsignaturas()) {
                System.out.println("- " + asignatura.getNombre());
            }
            System.out.println("----------");
        }
    }

}
