package programacionorientadaobjetos.padawanjavajedi;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Contacto {
    private String nombre;
    private String numeroDeTelefono;
    private String correoElectronico;

    public Contacto(String nombre, String numeroDeTelefono, String correoElectronico) {
        this.nombre = nombre;
        this.numeroDeTelefono = numeroDeTelefono;
        this.correoElectronico = correoElectronico;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de teléfono: " + numeroDeTelefono);
        System.out.println("Correo electrónico: " + correoElectronico);
    }

    public String getNombre() {
        return this.nombre;
    }

    public static void main(String[] args) {
        List<Contacto> listaContactos = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while(!salir){
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Mostrar lista de contactos");
            System.out.println("5. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = scanner.nextInt();

            switch(opcion){
                case 1:
                    scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Número de teléfono: ");
                    String numeroDeTelefono = scanner.nextLine();
                    System.out.print("Correo electrónico: ");
                    String correoElectronico = scanner.nextLine();
                    Contacto contacto = new Contacto(nombre, numeroDeTelefono, correoElectronico);
                    listaContactos.add(contacto);
                    break;
                case 2:
                    if (listaContactos.isEmpty()) {
                        System.out.println("No hay contactos para eliminar");
                    } else {
                        System.out.println("Escriba el nombre del contacto que desea eliminar");
                        scanner.nextLine();
                        String contactoPorEliminar = scanner.nextLine();
                        for (Contacto i : listaContactos) {
                            if (i.getNombre().equalsIgnoreCase(contactoPorEliminar)) {
                                listaContactos.remove(i);
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
                    if (listaContactos.isEmpty()) {
                        System.out.println("No hay contactos");
                    } else {
                        System.out.println("Escriba el nombre del contacto que desea buscar");
                        scanner.nextLine();
                        String contactoBuscar = scanner.nextLine();
                        System.out.println();
                        for (Contacto i : listaContactos) {
                            if (i.getNombre().equalsIgnoreCase(contactoBuscar)) {
                                System.out.println("Información del contacto encontrado:");
                                i.imprimirDatos();
                                break;
                            } else {
                                System.out.println("Contacto no encontrado");
                            }
                        }
                    }
                    break;
                case 4:
                    if (listaContactos.isEmpty()) {
                        System.out.println("No hay contactos");
                    } else {
                        for (Contacto i : listaContactos) {
                            i.imprimirDatos();
                            System.out.println();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Programa finalizado");
                    salir=true;
                    scanner.close();
                    break;
                default:
                    System.out.println("Solo números entre 1 y 5");
            }

        }
    }

}