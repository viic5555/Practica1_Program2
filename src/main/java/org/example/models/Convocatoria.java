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
