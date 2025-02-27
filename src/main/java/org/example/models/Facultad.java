package org.example.models;

import java.util.ArrayList;

public class Facultad {
    private String nombre;
    private int codigo;
    private long telefono;
    public ArrayList<Titulacion> titulaciones;

    private static void addTitulacion(ArrayList<Titulacion> titulaciones, Titulacion titulacion) {
        titulaciones.add(titulacion);
    }

    private static void removeTitulacion(ArrayList<Titulacion> titulaciones, Titulacion titulacion) {
        titulaciones.remove(titulacion);
    }

}
