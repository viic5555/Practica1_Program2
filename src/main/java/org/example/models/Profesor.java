package org.example.models;

import java.util.ArrayList;

/**
 * Profesor.java
 * Version 1.0 22/03/2025 Victor Martin
 */
public class Profesor extends Persona {
    private int horasSemanales;
    private ArrayList<Asignatura> asignaturas;


    public Profesor(String nombre, int codigo, int horasSemanales) {
        super(nombre, codigo);
        this.horasSemanales = horasSemanales;
        this.asignaturas = new ArrayList<>();

    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }
    public void addAsignatura(Asignatura asignatura) {
        // verificamos que la asignatura no esté ya incluida en la lista de asignaturas del profesor.
        if (!asignaturas.contains(asignatura)) {
            asignaturas.add(asignatura);
        }
    }

    /**
     * Lista #2 Muestra las asignaturas que imparte cada profesor
     */
    public void mostrarAsignaturas() {
        System.out.println("Asignaturas que imparte el profesor: " + this.getNombre());
        asignaturas.forEach(System.out::println);
    }
}
