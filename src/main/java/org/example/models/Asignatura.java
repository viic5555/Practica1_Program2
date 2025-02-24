package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {
    private String nombre;
    private int codigo;
    private long creditos;
    private Profesor profesor;
    private Titulacion titulacion;
    private Matricula matricula;

    public Asignatura(String nombre, int codigo, long creditos, Profesor profesor, Titulacion titulacion, Matricula matricula) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.profesor = profesor;
        this.titulacion = titulacion;
        this.matricula = matricula;
    }


    /*public void addAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }*/
}
