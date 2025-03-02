package org.example.models;

import java.util.ArrayList;

public abstract class Persona {
    private String nombre;
    private String codigo;
    public Persona(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }
}
