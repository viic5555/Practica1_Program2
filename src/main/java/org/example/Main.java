package org.example;

import org.example.models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear facultad y titulación
        Facultad escuelaPolitecnicaSuperiorDeTeruel = new Facultad("Escuela Politecnica superior de Teruel", 1, 912345678);
        Titulacion ingenieriaInformatica = new Titulacion("Ingenieria Informatica", 1, escuelaPolitecnicaSuperiorDeTeruel);

        // Crear profesores
        Profesor jose = new Profesor("José Roldán", 101, 10, new ArrayList<>());

        // Crear alumnos
        Alumno carlos = new Alumno("Carlos", 201);
        Alumno maria = new Alumno("Maria", 202);
        Alumno luis = new Alumno("Luis", 203);

        // Crear asignaturas (se añaden automaticamente al profesor)
        Asignatura matematicas = new Asignatura("Matematicas", 6.0f, 301, jose, new ArrayList<>(), ingenieriaInformatica);
        Asignatura programacion = new Asignatura("Programación", 6.0f, 302, jose, new ArrayList<>(), ingenieriaInformatica);

        // Crear convocatorias (matricular alumnos en asignaturas)
        Convocatoria convocatoriaMatematicas1 = new Convocatoria(2023, 1, 3.7f, matematicas, carlos);
        Convocatoria convocatoriaMatematicas2 = new Convocatoria(2023, 2, 8.0f, matematicas, maria);
        Convocatoria convocatoriaProgramacion1 = new Convocatoria(2023, 1, 4.4f, programacion, maria);
        Convocatoria convocatoriaProgramacion2 = new Convocatoria(2023, 2, 9.0f, programacion, luis);

        // Mostrar alumnos matriculados en la asignatura matemáticas
        matematicas.mostrarAlumnos();
        // Mostrar alumnos matriculados en la asignatura programación (DESCOMENTAR)
        programacion.mostrarAlumnos();
        lista2Test();
    }

    private static void lista2Test() {
    }

    private static void lista1Test() {

    }
}