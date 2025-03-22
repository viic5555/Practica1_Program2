package org.example.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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
     * Lista #3 Imprime un listado de las asignaturas que el alumno en cuestión está matriculado
     *
     */
    public void asignaturasFromAlumno() {
        System.out.println("Asignaturas en las que está matriculado el alumno NIP: " + this.getCodigo());
        // Un Set es un tipo de colección en Java que no permite duplicados. Ya que internamente utiliza equals() y
        // hashCode() del tipo de objeto sobre el que hay que hacer la colección (Asignatura en este caso, y por ello he
        // generado manualmente ambos métodos en dicha clase) para verificar la igualdad de los dos elementos.
        // Por ello en el primer for añadimos todas las asignaturas sin ningún filtro y en el segundo for se realiza la
        // impresión por pantalla de los nombres y códigos de las asignaturas sin necesidad de realizar ninguna comprobación manual.
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
                System.out.println(convocatoria); // Usa el método toString() de Convocatoria
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
