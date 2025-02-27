package org.example.models;

import java.util.ArrayList;

public class Convocatoria {
    private int anioMatricula;
    private int numeroConvocatoria;
    private float nota;
    private String notaTextual;
    ArrayList<Asignatura> asignaturas;
    ArrayList<Alumno> alumnos;

    public Convocatoria(int anioMatricula, int numeroConvocatoria, float nota, String notaTextual, ArrayList<Asignatura> asignaturas, ArrayList<Alumno> alumnos) {
        this.anioMatricula = anioMatricula;
        this.numeroConvocatoria = numeroConvocatoria;
        this.nota = nota;
        this.notaTextual = notaTextual;
        this.asignaturas = asignaturas;
        this.alumnos = alumnos;
    }

    // Quizás los métodos de convocatorias vayan aquí y no en Asignatura ¿No creo no?
}
