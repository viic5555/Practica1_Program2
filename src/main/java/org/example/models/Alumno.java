package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona {
    public ArrayList<Convocatoria> convocatorias;

    public Alumno(String nombre, String codigo, ArrayList<Asignatura> asignaturas, ArrayList<Convocatoria> convocatorias) {
        super(nombre, codigo, asignaturas);
        this.convocatorias = convocatorias;
    }

    public Alumno(String nombre, String codigo, ArrayList<Asignatura> asignaturas) {
        super(nombre, codigo, asignaturas);

    }
}
