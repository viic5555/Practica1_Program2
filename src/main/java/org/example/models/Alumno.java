package org.example.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Alumno.java
 * Version 1.0 22/03/2025 Victor Martin
 */
public class Alumno extends Persona {
    public ArrayList<Convocatoria> convocatorias;

    public Alumno(String nombre, int codigo) {
        super(nombre, codigo);
        this.convocatorias = new ArrayList<>();
    }

    public ArrayList<Convocatoria> getConvocatorias() {
        return convocatorias;
    }

    public void addConvocatoria(Convocatoria convocatoria) {
        convocatorias.add(convocatoria);
    }
    /**
     * Lista #3: Imprime un listado de las asignaturas que el alumno en cuestión está matriculado. Sin duplicidades.
     */
    public void asignaturasFromAlumno() {
        System.out.println("Asignaturas en las que está matriculado el alumno NIP: " + this.getCodigo());
        Set<Asignatura> asignaturasUnicas = new HashSet<>();

        for (Convocatoria convocatoria : convocatorias) {
            asignaturasUnicas.add(convocatoria.getAsignatura());
        }

        // Imprimir todas las asignaturas únicas
        for (Asignatura asignatura : asignaturasUnicas) {
            System.out.println(asignatura);
        }
    }

    /**
     * Lista #4: Muestra el nombre y el año de las asignaturas que tiene suspensas un alumno determinado.
     */
    public void asignaturasSuspensasNombreYAnio() {
        System.out.println("Asignaturas suspensas del alumno NIP: " + this.getCodigo());
        for (Convocatoria convocatoria : this.getConvocatorias()) { // Accede directamente a la lista del alumno
            // Verificar si la nota textual es "Suspenso"
            if (convocatoria.getNotaTextual().equals(Convocatoria.SUSPENSO)) {
                System.out.println(convocatoria);
            }
        }
    }

    /**
     * Lista #6 asignaturas que un alumno no ha superado en primera convocatoria.
     */
    public void asignaturasSuspensasPrimeraConvocatoria() {
        System.out.println("Asignaturas suspensas en la primera convocatoria del alumno NIP " + this.getCodigo());
        for (Convocatoria convocatoria : this.getConvocatorias()) {
            // Verificar si la nota textual es "Suspenso" y si es la primera convocatoria
            if (convocatoria.getNotaTextual().equals(Convocatoria.SUSPENSO) && convocatoria.getNumeroConvocatoria() == 1) {
                System.out.println(convocatoria);
            }
        }
    }
}
