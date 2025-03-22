package org.example;

import org.example.models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear facultad y titulación
        Facultad escuelaPolitecnicaSuperiorDeTeruel = new Facultad("Escuela Politecnica superior de Teruel", 1, 912345678);
        Titulacion ingenieriaInformatica = new Titulacion("Ingenieria Informatica", 1, 978000000,escuelaPolitecnicaSuperiorDeTeruel);

        // Crear profesores
        Profesor jose = new Profesor("José Roldán", 101, 10, new ArrayList<>());
        Profesor daniel = new Profesor("Daniel Isidoro", 102, 12, new ArrayList<>());

        // Crear alumnos
        Alumno carlos = new Alumno("Carlos", 201);
        Alumno maria = new Alumno("Maria", 202);
        Alumno luis = new Alumno("Luis", 203);

        // Crear asignaturas (se añaden automaticamente al profesor)
        Asignatura matematicas = new Asignatura("Matematicas", 6.0f, 301, jose, new ArrayList<>(), ingenieriaInformatica);
        Asignatura programacion = new Asignatura("Programación", 6.0f, 302, jose, new ArrayList<>(), ingenieriaInformatica);
        Asignatura estadistica = new Asignatura("Estadística", 6.0f, 303, daniel, new ArrayList<>(), ingenieriaInformatica);
        ingenieriaInformatica.addAsignatura(matematicas);
        ingenieriaInformatica.addAsignatura(programacion);
        ingenieriaInformatica.addAsignatura(estadistica);

        // Crear convocatorias (matricular alumnos en asignaturas)
        Convocatoria convocatoriaMatematicas1 = new Convocatoria(2022, 1, 3.7f, matematicas, carlos);
        Convocatoria convocatoriaMatematicas2 = new Convocatoria(2023, 2, 8.0f, matematicas, maria);
        Convocatoria convocatoriaProgramacion1 = new Convocatoria(2023, 1, 4.4f, programacion, maria);
        Convocatoria convocatoriaProgramacion2 = new Convocatoria(2023, 2, 9.0f, programacion, luis);


        // Asignar asignaturas al profesor
        jose.addAsignatura(matematicas);
        jose.addAsignatura(programacion);

        // Añadir convocatorias a un alumno
        maria.addConvocatoria(convocatoriaMatematicas1);
        maria.addConvocatoria(convocatoriaMatematicas2);
        maria.addConvocatoria(convocatoriaProgramacion1);
        maria.addConvocatoria(convocatoriaProgramacion2);

        // PRUEBA LISTA 1
        matematicas.mostrarAlumnos();
        programacion.mostrarAlumnos();
        System.out.println("\n");

        // PRUEBA LISTA 2
        jose.mostrarAsignaturas();
        System.out.println("\n");

        // PRUEBA LISTA 3
        // como se puede apreciar al ejecutar esta instrucción, la duplicidad está controlada en la lista.
        maria.asignaturasFromAlumno();
        System.out.println("\n");

        // PRUEBA LISTA 4
        maria.asignaturasSuspensasNombreYAnio();
        System.out.println("\n");

        // PRUEBA LISTA 5
        ingenieriaInformatica.asignaturasFromTitulacion();
        System.out.println("\n");

        // PRUEBA LISTA 6
        maria.asignaturasSuspensasPrimeraConvocatoria();
    }

}