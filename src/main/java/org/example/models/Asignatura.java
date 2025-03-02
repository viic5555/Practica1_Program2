package org.example.models;

import java.util.ArrayList;
import java.util.Objects;

public class Asignatura {
    private String nombre;
    private long creditos;
    private String codigo;
    private Profesor profesor;
    private Titulacion titulacion;
    public ArrayList<Convocatoria> convocatorias;
    public ArrayList<Alumno> alumnos;

    public Asignatura(String nombre, long creditos, String codigo, Profesor profesor, ArrayList<Convocatoria> convocatorias, Titulacion titulacion, ArrayList<Alumno> alumnos) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.codigo = codigo;
        this.profesor = profesor;
        this.convocatorias = convocatorias;
        this.titulacion = titulacion;
        this.alumnos = alumnos;
    }


    // Getters
    public String getNombre() {
        return nombre;
    }

    public long getCreditos() {
        return creditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Titulacion getTitulacion() {
        return titulacion;
    }

    public static ArrayList<Alumno> getAlumnos(ArrayList<Alumno> alumnos) {
        return alumnos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Asignatura that = (Asignatura) o;
        return codigo == that.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    /**
     *
     * @param
     * @return Lista #1: de alumnos matriculados en una determinada asignatura.
     */
    public void mostrarAlumnos() {
        alumnos.forEach(System.out::println);
    }



}
