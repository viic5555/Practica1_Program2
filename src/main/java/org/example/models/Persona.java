package org.example.models;

import java.util.Objects;
/**
 * Persona.java
 * Version 1.0 22/03/2025 Victor Martin
 */
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

    /**
     * @param o hace referencia a este mismo objeto.
     * @return booleano que indica si la Persona es idéntica a la otra, se usa en algunas consultas como validación
     *  + para evitar duplicidades.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(codigo, persona.codigo);
    }

    /**
     * @return convierte el código de la asignatura en un hashCode unívoco que ninguna otra Asignatura puede tener.
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }
}
