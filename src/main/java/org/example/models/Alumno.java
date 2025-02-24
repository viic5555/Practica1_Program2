package org.example.models;

import java.util.List;

public class Alumno extends Persona {
    public List<Asignatura> asignaturasAlumno;
    public Alumno(String nombre, String codigo) {
        super(nombre, codigo);
    }
}
