package programacionorientadaobjetos.iniciadojavajedi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Curso {
    private String nombre;
    private String descripcion;
    private List<Alumno> alumnos;

    public Curso(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void imprimirInfoCurso() {
        System.out.println("Nombre del curso: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Alumnos inscritos:");

        for (Alumno alumno : alumnos) {
            alumno.imprimirDatos();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Curso> cursos = new ArrayList<>();

        System.out.print("Ingrese la cantidad de cursos (N): ");
        int cantidadCursos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidadCursos; i++) {
            System.out.println("Ingrese los datos del Curso " + (i + 1) + ":");
            System.out.print("Nombre del curso: ");
            String nombreCurso = scanner.nextLine();
            System.out.print("Descripción: ");
            String descripcionCurso = scanner.nextLine();

            Curso curso = new Curso(nombreCurso, descripcionCurso);

            System.out.print("Ingrese la cantidad de alumnos en el curso: ");
            int cantidadAlumnos = scanner.nextInt();
            scanner.nextLine();

            for (int j = 0; j < cantidadAlumnos; j++) {
                System.out.println("Ingrese los datos del Alumno " + (j + 1) + ":");
                System.out.print("Nombre: ");
                String nombreAlumno = scanner.nextLine();
                System.out.print("Apellido: ");
                String apellidoAlumno = scanner.nextLine();
                System.out.print("Fecha de nacimiento (YYYY-MM-DD): ");
                String fechaNacimientoStr = scanner.nextLine();
                LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);

                Alumno alumno = new Alumno(nombreAlumno, apellidoAlumno, fechaNacimiento);
                curso.agregarAlumno(alumno);
            }

            cursos.add(curso);
        }

        System.out.println("\nInformación de los cursos:");
        for (Curso curso : cursos) {
            curso.imprimirInfoCurso();
            System.out.println();
        }

        scanner.close();
    }
}
