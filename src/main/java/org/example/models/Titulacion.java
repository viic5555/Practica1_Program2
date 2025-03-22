package org.example.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Titulacion {
    private String nombre;
    private int codigo;
    private long telefono;
    private Facultad facultad;
    private ArrayList<Asignatura> asignaturas;

    public Titulacion(String nombre, int codigo, long telefono, Facultad facultad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.telefono = telefono;
        this.facultad = facultad;
        this.asignaturas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void addAsignatura(Asignatura asignatura){
        this.asignaturas.add(asignatura);
    }

    /**
     * Lista #5 Asignaturas dentro de una Titulación (no deberían estar repetidas.)
     */
    public void asignaturasFromTitulacion() {
        System.out.println("Asignaturas de la titulación: " + this.getNombre());

        Set<Asignatura> asignaturasUnicas = new HashSet<>();

        // Imprimir todas las asignaturas únicas
        for (Asignatura asignatura : this.getAsignaturas()) {

            System.out.println(asignatura);
        }
    }
}
