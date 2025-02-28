package org.example.models;

import java.util.ArrayList;

public class Alumno extends Persona {
    public ArrayList<Convocatoria> convocatorias;

    public Alumno(String nombre, String codigo, ArrayList<Asignatura> asignaturas, ArrayList<Convocatoria> convocatorias) {
        super(nombre, codigo, asignaturas);
        this.convocatorias = convocatorias;
    }

    public Alumno(String nombre, String codigo, ArrayList<Asignatura> asignaturas) {
        super(nombre, codigo, asignaturas);

    }

    public ArrayList<Convocatoria> getConvocatorias() {
        return convocatorias;
    }

    /**
     *
     * @param asignaturas
     * @return Lista #3, asignaturas en las que está matriculado un alumno determinado.
     */
    private static ArrayList<Asignatura> showAsignaturas(ArrayList<Asignatura> asignaturas) {
        return asignaturas;
    }


}
