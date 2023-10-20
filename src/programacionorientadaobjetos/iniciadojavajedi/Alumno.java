package programacionorientadaobjetos.iniciadojavajedi;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alumno {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private int edad;

    // Constructor
    public Alumno(String nombre, String apellido, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Alumno> listaAlumnos = new ArrayList<>();

        System.out.print("Ingrese la cantidad de alumnos (N): ");
        int cantidadAlumnos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingrese los datos del Alumno " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Fecha de nacimiento (YYYY-MM-DD): ");
            String fechaNacimientoStr = scanner.nextLine();
            LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);

            Alumno alumno = new Alumno(nombre, apellido, fechaNacimiento);
            listaAlumnos.add(alumno);
        }

        System.out.println("\nDatos de los Alumnos:");
        for (Alumno alumno : listaAlumnos) {
            alumno.imprimirDatos();
            System.out.println();
        }

        scanner.close();
    }
}
