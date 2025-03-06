package org.example.models;

import java.util.ArrayList;

public class Profesor extends Persona {
    private int horasSemanales;
    private ArrayList<Asignatura> asignaturas;


    public Profesor(String nombre, int codigo, int horasSemanales, ArrayList<Asignatura> asignaturas) {
        super(nombre, codigo);
        this.horasSemanales = horasSemanales;
        this.asignaturas = new ArrayList<>();

    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    /**
     * Lista #2 Muestra las asignaturas que imparte cada profesor
     */
    public void mostrarAsignaturas() {
        asignaturas.forEach(System.out::println);
    }
}
