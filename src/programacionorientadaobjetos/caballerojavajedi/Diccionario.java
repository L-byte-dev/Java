package programacionorientadaobjetos.caballerojavajedi;

import java.util.*;

public class Diccionario {
    private String nombre;
    private Map<String, Palabra> palabras;

    public Diccionario(String nombre) {
        this.nombre = nombre;
        this.palabras = new HashMap<>();
    }

    public void agregarPalabra(String palabra, String definicion) {
        Palabra nuevaPalabra = new Palabra(palabra, definicion);
        palabras.put(palabra, nuevaPalabra);
    }

    public String buscarDefinicion(String palabra) {
        Palabra palabraBuscada = palabras.get(palabra);
        if (palabraBuscada != null) {
            return palabraBuscada.getDefinicion();
        } else {
            return "La palabra no se encuentra en el diccionario.";
        }
    }

    public void mostrarPalabras() {
        System.out.println("Palabras en '" + nombre + "':");
        for (Map.Entry<String, Palabra> entry : palabras.entrySet()) {
            String palabra = entry.getKey();
            Palabra palabraObj = entry.getValue();
            System.out.println(palabra + ": " + palabraObj.getDefinicion());
        }
    }

    class Palabra {
        private String palabra;
        private String definicion;

        public Palabra(String palabra, String definicion) {
            this.palabra = palabra;
            this.definicion = definicion;
        }

        public String getPalabra() {
            return palabra;
        }

        public String getDefinicion() {
            return definicion;
        }
    }

    static class Main {
        public static void main(String[] args) {
            Diccionario diccionario = new Diccionario("Diccionario en Java");
            Scanner scanner = new Scanner(System.in);
            boolean salir = false;
            int opcion;

            while (!salir) {
                System.out.println("1. Agregar palabra y definición");
                System.out.println("2. Buscar definición de palabra");
                System.out.println("3. Mostrar todas las palabras");
                System.out.println("4. Salir");

                System.out.println("Escribe una de las opciones");
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("Palabra: ");
                        String palabra = scanner.nextLine();
                        System.out.print("Definición: ");
                        String definicion = scanner.nextLine();
                        diccionario.agregarPalabra(palabra, definicion);
                        break;
                    case 2:
                        System.out.print("Ingrese la palabra para buscar su definición: ");
                        String palabraBuscar = scanner.nextLine();
                        String definicionBuscada = diccionario.buscarDefinicion(palabraBuscar);
                        System.out.println(definicionBuscada);
                        break;
                    case 3:
                        diccionario.mostrarPalabras();
                        break;
                    case 4:
                        System.out.println("Programa finalizado");
                        scanner.close();
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            }
        }
    }
}