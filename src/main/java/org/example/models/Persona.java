package org.example.models;

import java.util.ArrayList;

public abstract class Persona {
    private String nombre;
    private String codigo;
    ArrayList<Asignatura> asignaturas;
    public Persona(String nombre, String codigo, ArrayList<Asignatura> asignaturas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.asignaturas = new ArrayList<>();
    }

    protected static void showASignaturas(ArrayList<Asignatura> asignaturas) {
        asignaturas.forEach(System.out::println);
    }
}
