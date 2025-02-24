package org.example.models;

import java.util.List;

public class Profesor extends Persona {
    public List<Asignatura> asignaturasProfesor;

    public Profesor(String nombre, String codigo) {
        super(nombre, codigo);
    }
}
