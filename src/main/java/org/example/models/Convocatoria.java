package org.example.models;

import java.util.ArrayList;

public class Convocatoria {
    final public static float MARCA_SUSPENSO = 4.9f;
    final public static float MARCA_SUFICIENTE = 5.0f;
    final public static float MARCA_BIEN = 6.0f;
    final public static float MARCA_NOTABLE = 7.0f;
    final public static float MARCA_SOBRESALIENTE = 8.0f;


    final public static String SUSPENSO = "Suspenso.";
    final public static String SUFICIENTE = "Suficiente.";
    final public static String BIEN = "Bien.";
    final public static String NOTABLE = "Notable.";
    final public static String SOBRESALIENTE = "Sobresaliente.";

    private int anioMatricula;
    private int numeroConvocatoria;
    private float nota;
    private String notaTextual;
    Asignatura asignatura;
    Alumno alumno;

    public Convocatoria(int anioMatricula, int numeroConvocatoria, float nota, String notaTextual, Asignatura asignatura, Alumno alumno) {
        this.anioMatricula = anioMatricula;
        this.numeroConvocatoria = numeroConvocatoria;
        this.nota = nota;
        this.notaTextual = notaTextual;
        this.asignatura = asignatura;
        this.alumno = alumno;
    }

    public int getAnioMatricula() {
        return anioMatricula;
    }

    public int getNumeroConvocatoria() {
        return numeroConvocatoria;
    }

    public float getNota() {
        return nota;
    }

    public String getNotaTextual() {
        return notaTextual;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public Alumno getAlumno() {
        return alumno;
    }
    // Quizás los métodos de convocatorias vayan aquí y no en Asignatura ¿No creo no? Pues SI xd

}
