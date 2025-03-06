package org.example.models;

import java.util.ArrayList;

public class Profesor extends Persona {
    private int horasSemanales;
    private ArrayList<Asignatura> asignaturas = new ArrayList<>();


    public Profesor(String nombre, String codigo, int horasSemanales) {
        super(nombre, codigo);
        this.horasSemanales = horasSemanales;

    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    /**
     * Lista #2 Muestra las asignaturas que imparte cada profesor
     */
    public void mostrarAsignaturas() {
        asignaturas.forEach(System.out::println);
    }
}
