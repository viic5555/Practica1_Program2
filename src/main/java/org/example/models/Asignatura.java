package org.example.models;

import java.util.ArrayList;
import java.util.List;

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
        this.convocatorias = convocatorias;
        this.titulacion = titulacion;
        this.alumnos = alumnos;
    }

    // ¿return o ArrayList?
    public static void showAlumnos(ArrayList<Alumno> alumnos) {
        alumnos.forEach(System.out::println);
    }

    public static void getConvocatoriasSuspensas (ArrayList<Convocatoria> convocatoriasSuspensas){

    }

    public static void getPrimerasConvocatoriasSuspensas (ArrayList<Convocatoria> convocatoriasSuspensas1){


    }
}
