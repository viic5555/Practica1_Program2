package org.example.models;

public class Convocatoria {
    final public static float MARCA_SUFICIENTE = 5.0f;
    final public static float MARCA_BIEN = 6.0f;
    final public static float MARCA_NOTABLE = 7.0f;
    final public static float MARCA_SOBRESALIENTE = 9.0f;
    final public static float MARCA_MATRICULA_DE_HONOR = 10.0f;

    final public static String SUSPENSO = "Suspenso.";
    final public static String SUFICIENTE = "Suficiente.";
    final public static String BIEN = "Bien.";
    final public static String NOTABLE = "Notable.";
    final public static String SOBRESALIENTE = "Sobresaliente.";
    final public static String MATRICULA_DE_HONOR = "Matrícula de Honor.";

    private int anioMatricula;
    private int numeroConvocatoria;
    private float nota;
    private String notaTextual;
    Asignatura asignatura;
    Alumno alumno;

    public Convocatoria(int anioMatricula, int numeroConvocatoria, float nota, Asignatura asignatura, Alumno alumno) {
        this.anioMatricula = anioMatricula;
        this.numeroConvocatoria = numeroConvocatoria;
        this.nota = nota;
        this.notaTextual = setNotaTextual(nota);
        this.asignatura = asignatura;
        this.alumno = alumno;
    }

    public int getNumeroConvocatoria() {
        return numeroConvocatoria;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public String getNotaTextual() {
        return notaTextual;
    }

    public int getAnioMatricula() {
        return anioMatricula;
    }

    public String setNotaTextual(float nota) {
        if (nota < MARCA_SUFICIENTE) {
            return this.notaTextual = SUSPENSO;
        } else if (nota >= MARCA_SUFICIENTE && nota < MARCA_BIEN) {
            return this.notaTextual = SUFICIENTE;
        } else if (nota >= MARCA_BIEN && nota < MARCA_NOTABLE) {
            return this.notaTextual = BIEN;
        } else if (nota >= MARCA_NOTABLE && nota < MARCA_SOBRESALIENTE) {
            return this.notaTextual = NOTABLE;
        } else if (nota >= MARCA_SOBRESALIENTE && nota < MARCA_MATRICULA_DE_HONOR) {
            return this.notaTextual = SOBRESALIENTE;
        } else {
            return this.notaTextual = MATRICULA_DE_HONOR;
        }
    }
}
