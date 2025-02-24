package org.example.models;

import java.util.ArrayList;
import java.util.List;

// clase intermedia entre Alumno y Asignatura.
public class Matricula {
    public List<Alumno> alumnosMatriculados;
    private Asignatura asignatura;
    private int anioMatricula;
    private int numeroConvocatoria;
    private double notaNumerica;
    private String notaTextual;
    public Matricula(){};

    public Matricula(List<Alumno> alumnosMatriculados, Asignatura asignatura, int anioMatricula, int numeroConvocatoria, double notaNumerica, String notaTextual) {
        this.alumnosMatriculados = new ArrayList<>();
        this.asignatura = asignatura;
        this.anioMatricula = anioMatricula;
        this.numeroConvocatoria = numeroConvocatoria;
        this.notaNumerica = notaNumerica;
        this.notaTextual = notaTextual;
    }

    private void actualizarNotaTextual() {
        if (notaNumerica >= 5.0) {
            this.notaTextual = "Aprobado";
        } else {
            this.notaTextual = "Suspenso";
        }
    }

    public List<Alumno> getAlumnosMatriculados() {
        return alumnosMatriculados;
    }
}
