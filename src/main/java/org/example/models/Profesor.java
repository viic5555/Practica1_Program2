package org.example.models;

import java.util.ArrayList;

public class Profesor extends Persona {
    private int horasSemanales;


    public Profesor(String nombre, String codigo, ArrayList<Asignatura> asignaturas, int horasSemanales) {
        super(nombre, codigo, asignaturas);
        this.horasSemanales = horasSemanales;

    }

        // Añade una asignatura a la lista del profesor
    public void addAsignatura(Asignatura asignatura) {
        this.asignaturas.add(asignatura);
    }
}
