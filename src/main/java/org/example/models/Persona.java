package org.example.models;

import java.util.Objects;

public abstract class Persona {
    private String nombre;
    private int codigo;
    public Persona(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(codigo, persona.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }
}
