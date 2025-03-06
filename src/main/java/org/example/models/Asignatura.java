package org.example.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Asignatura {
    private String nombre;
    private long creditos;
    private String codigo;
    private Profesor profesor;
    private Titulacion titulacion;
    public ArrayList<Convocatoria> convocatorias;

    public Asignatura(String nombre, long creditos, String codigo, Profesor profesor, ArrayList<Convocatoria> convocatorias, Titulacion titulacion) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.codigo = codigo;
        this.profesor = profesor;
        this.convocatorias = convocatorias;
        this.titulacion = titulacion;
    }


    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
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
     * Lista #1: de alumnos matriculados en una determinada asignatura.
     */
    public void mostrarAlumnos() {
        Set<Alumno> alumnosUnicos = new HashSet<>();

        for (Convocatoria convocatoria : convocatorias) {
            alumnosUnicos.add(convocatoria.getAlumno());
        }

        // Imprimir todas las alumnos únicas
        for (Alumno alumno : alumnosUnicos) {
            System.out.println("Código: " + alumno.getCodigo() + " - Nombre: " + alumno.getNombre());
        }
    }

}
