package programacionorientadaobjetos.padawanjavajedi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Calificacion {
    private int calificacion;
    private String fechaCreacion;

    public Calificacion(int calificacion, String fechaCreacion) {
        this.calificacion = calificacion;
        this.fechaCreacion = fechaCreacion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }
}

class Estudiante {
    private String nombre;
    private int numeroIdentificacion;
    private List<Calificacion> calificaciones;

    public Estudiante(String nombre, int numeroIdentificacion) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.calificaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void agregarCalificacion(Calificacion calificacion) {
        calificaciones.add(calificacion);
    }

    public double calcularPromedioCalificaciones() {
        if (calificaciones.isEmpty()) {
            return 0;
        }

        int totalCalificaciones = 0;
        for (Calificacion calificacion : calificaciones) {
            totalCalificaciones += calificacion.getCalificacion();
        }

        return (double) totalCalificaciones / calificaciones.size();
    }
}

public class EstudiantesApp {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.print("Ingrese el nombre del estudiante: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el número de identificación: ");
            int numeroIdentificacion = scanner.nextInt();
            scanner.nextLine();

            Estudiante estudiante = new Estudiante(nombre, numeroIdentificacion);

            boolean agregarCalificacion = true;
            while (agregarCalificacion) {
                int calificacion;
                do {
                    System.out.print("Ingrese la calificación (1 al 10): ");
                    calificacion = scanner.nextInt();
                    scanner.nextLine();
                } while (calificacion < 1 || calificacion > 10);

                System.out.print("Ingrese la fecha de creación de la calificación (YYYY-MM-DD): ");
                String fechaCreacion = scanner.nextLine();
                estudiante.agregarCalificacion(new Calificacion(calificacion, fechaCreacion));

                System.out.print("¿Desea agregar otra calificación? (Sí/No): ");
                String respuesta = scanner.nextLine().toLowerCase();
                agregarCalificacion = respuesta.equals("sí") || respuesta.equals("si");
            }

            estudiantes.add(estudiante);

            System.out.print("¿Desea agregar otro estudiante? (Sí/No): ");
            String respuesta = scanner.nextLine().toLowerCase();
            continuar = respuesta.equals("sí") || respuesta.equals("si");
        }

        for (Estudiante estudiante : estudiantes) {
            double promedio = estudiante.calcularPromedioCalificaciones();
            System.out.println("Identificación: " + estudiante.getNumeroIdentificacion());
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Promedio de Calificaciones: " + promedio);
            System.out.println();
        }
    }
}