package org.example.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Alumno extends Persona {
    public ArrayList<Convocatoria> convocatorias;

    public Alumno(String nombre, String codigo) {
        super(nombre, codigo);
        this.convocatorias = new ArrayList<>();
    }

    /**
     * Lista #3 Imprime un listado de las asignaturas que el alumno en cuestión está matriculado
     *
     */
    public void asignaturasFromAlumno() {
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
            System.out.println("Código: " + asignatura.getCodigo() + " - Nombre: " + asignatura.getNombre());
        }
    }

    /**
     * Lista #4: mostrar nombre y año de las asignaturas que tiene suspensas un alumno determinado.
     */
    public void asignaturasSuspensasNombreYAnio(ArrayList<Convocatoria> convocatorias) {
        for (Convocatoria convocatoria : convocatorias) {
            // Verificar si la nota textual es "Suspenso"
            if (convocatoria.getNotaTextual().equals(Convocatoria.SUSPENSO)) {
                // Obtener la asignatura y el año de la convocatoria
                Asignatura asignatura = convocatoria.getAsignatura();

                // Mostrar el nombre de la asignatura y el año
                System.out.println("Asignatura: " + asignatura.getNombre() +"- Nota Textual: "+ convocatoria.getNotaTextual() +" - Año: " + convocatoria.getAnioMatricula());
            }
        }
    }

    /**
     * Lista #6 asignaturas que un alumno no ha superado en primera convocatoria.
     * @param convocatorias listado de convocatorias de un alumno.
     */
    public void asignaturasSuspensasPrimeraConvocatoria(ArrayList<Convocatoria> convocatorias) {
        for (Convocatoria convocatoria : convocatorias) {
            // Verificar si la nota textual es "Suspenso"
            if (convocatoria.getNotaTextual().equals(Convocatoria.SUSPENSO) && convocatoria.getNumeroConvocatoria() == 1) {
                // Obtener la asignatura y el año de la convocatoria
                Asignatura asignatura = convocatoria.getAsignatura();
                System.out.println("Asignatura: " + asignatura.getNombre() +"- Nota Textual: "+ convocatoria.getNotaTextual() +" - Matrícula número: " + convocatoria.getNumeroConvocatoria());

            }
        }
    }
}
