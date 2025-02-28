package org.example.models;

import java.util.ArrayList;

public class Asignatura {
    private String nombre;
    private long creditos;
    private int codigo;
    private Profesor profesor;
    private Titulacion titulacion;
    public ArrayList<Convocatoria> convocatorias;
    public ArrayList<Alumno> alumnos;

    public Asignatura(String nombre, long creditos, int codigo, Profesor profesor, ArrayList<Convocatoria> convocatorias, Titulacion titulacion, ArrayList<Alumno> alumnos) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.codigo = codigo;
        this.profesor = profesor;
        this.profesor.addAsignatura(this); // Añade la asignatura al profesor
        this.convocatorias = convocatorias;
        this.titulacion = titulacion;
        this.alumnos = alumnos;
    }


    // Getters

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    /**
     *
     * @param alumnos
     * @return Lista #1: de alumnos matriculados en una determinada asignatura.
     */
    public static ArrayList<Alumno> getAlumnos(ArrayList<Alumno> alumnos) {
        return alumnos;
    }

    public static void getConvocatoriasSuspensas (ArrayList<Convocatoria> convocatoriasSuspensas){

    }

    public static void getPrimerasConvocatoriasSuspensas (ArrayList<Convocatoria> convocatoriasSuspensas1){


    }



}
