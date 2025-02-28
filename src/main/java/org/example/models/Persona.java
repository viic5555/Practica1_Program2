package org.example.models;

import java.util.ArrayList;

public abstract class Persona {
    private String nombre;
    private String codigo;
    protected ArrayList<Asignatura> asignaturas;
    public Persona(String nombre, String codigo, ArrayList<Asignatura> asignaturas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.asignaturas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }
}
