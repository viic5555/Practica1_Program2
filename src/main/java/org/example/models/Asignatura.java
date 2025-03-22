package org.example.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Asignatura {
    private String nombre;
    private float creditos;
    private int codigo;
    private Profesor profesor;
    private Titulacion titulacion;
    public ArrayList<Convocatoria> convocatorias;

    public Asignatura(String nombre, float creditos, int codigo, Profesor profesor, ArrayList<Convocatoria> convocatorias, Titulacion titulacion) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.codigo = codigo;
        this.profesor = profesor;
        this.convocatorias = convocatorias;
        this.titulacion = titulacion;

        // Añadir esta asignatura al profesor creado en el Main automáticamente
        if (profesor != null) {
            profesor.getAsignaturas().add(this);
        }
    }


    // Getters
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Convocatoria> getConvocatorias() {
        return convocatorias;
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

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", creditos=" + creditos +
                ", codigo=" + codigo +
                '}';
    }

    /**
     * Lista #1: de alumnos matriculados en una determinada asignatura.
     */
    public void mostrarAlumnos() {
        Set<Alumno> alumnosUnicos = new HashSet<>();
        System.out.println("Alumnos matriculados en " + this.getNombre() + ":");

        for (Convocatoria convocatoria : convocatorias) {
            alumnosUnicos.add(convocatoria.getAlumno());
        }

        // Imprimir todas las alumnos únicas
        for (Alumno alumno : alumnosUnicos) {
            System.out.println("Código: " + alumno.getCodigo() + " - Nombre: " + alumno.getNombre());
        }
    }

}
