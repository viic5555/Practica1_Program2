package org.example.models;

import java.util.ArrayList;

public class Facultad {
    private String nombre;
    private int codigo;
    private long telefono;
    public ArrayList<Titulacion> titulaciones;
    private ArrayList<Profesor> profesores = new ArrayList<>(); // Nueva lista


    private static void addTitulacion(ArrayList<Titulacion> titulaciones, Titulacion titulacion) {
        titulaciones.add(titulacion);
    }

    private static void removeTitulacion(ArrayList<Titulacion> titulaciones, Titulacion titulacion) {
        titulaciones.remove(titulacion);
    }

    private static void addProfesor(ArrayList<Profesor> profesores, Profesor profesor) {
        profesores.add(profesor);
    }

    private static void removeProfesor(ArrayList<Profesor> profesores, Profesor profesor) {
        profesores.remove(profesor);
    }

    /**
     *  Lista #2, lista de asignaturas que imparte cada profesor.
     */
    public void listarAsignaturasPorProfesor() {
        for (Profesor profesor : profesores) {
            System.out.println("Profesor: " + profesor.getNombre());
            System.out.println("Asignaturas:");
            for (Asignatura asignatura : profesor.getAsignaturas()) {
                System.out.println("- " + asignatura.getNombre());
            }
            System.out.println("----------");
        }
    }

}
