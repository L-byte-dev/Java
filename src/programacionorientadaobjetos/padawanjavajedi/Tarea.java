package programacionorientadaobjetos.padawanjavajedi;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarea {
    private String titulo;
    private String descripcion;
    private LocalDate fechaDeVencimento;

    public Tarea(String titulo, String descripcion, LocalDate fechaDeVencimento) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaDeVencimento = fechaDeVencimento;
    }

    public void imprimirDatos() {
        System.out.println("Título: " + titulo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Fecha de vencimento: " + fechaDeVencimento);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public static void main(String[] args) {
        List<Tarea> listaTareas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while(!salir){
            System.out.println("1. Agregar tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("3. Listar tareas");
            System.out.println("4. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = scanner.nextInt();

            switch(opcion){
                case 1:
                    scanner.nextLine();
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Descripción: ");
                    String descripcion = scanner.nextLine();
                    System.out.print("Fecha de vencimento: ");
                    String fechaDeVencimentoStr = scanner.nextLine();
                    LocalDate fechaNacimiento = LocalDate.parse(fechaDeVencimentoStr);
                    Tarea tarea = new Tarea(titulo, descripcion, fechaNacimiento);
                    listaTareas.add(tarea);
                    break;
                case 2:
                    if (listaTareas.isEmpty()) {
                        System.out.println("No hay tareas para eliminar");
                    } else {
                        System.out.println("Escriba el título de la tarea desea eliminar");
                        scanner.nextLine();
                        String tareaPorEliminar = scanner.nextLine();
                        for (Tarea i : listaTareas) {
                            if (i.getTitulo().equalsIgnoreCase(tareaPorEliminar)) {
                                listaTareas.remove(i);
                                System.out.println("Contacto eliminado exitosamente");
                                break;
                            } else {
                                System.out.println("No se encontró el contacto en la lista.");
                                break;
                            }
                        }
                    }
                    break;
                case 3:
                    if (listaTareas.isEmpty()) {
                        System.out.println("No hay tareas");
                    } else {
                        for (Tarea i : listaTareas) {
                            i.imprimirDatos();
                            System.out.println();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Programa finalizado");
                    salir=true;
                    scanner.close();
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }

        }
    }

}