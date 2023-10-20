package programacionorientadaobjetos.caballerojavajedi;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Libro {
    private String titulo;
    private Autor autor;
    private Boolean estaDisponible;

    public Libro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.estaDisponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public Boolean getEstaDisponible() {
        return estaDisponible;
    }
}

class Autor {
    private String nombre;

    public Autor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Biblioteca {
    private HashMap<String, List<Libro>> libros;

    public Biblioteca() {
        this.libros = new HashMap<>();
    }

    public void registrarLibro(Libro libro) {
        String titulo = libro.getTitulo();
        if (!libros.containsKey(titulo)) {
            libros.put(titulo, new ArrayList<>());
        }
        libros.get(titulo).add(libro);
    }

    public List<Libro> buscarPorTitulo(String titulo) {
        List<Libro> resultados = new ArrayList<>();
        if (libros.containsKey(titulo)) {
            resultados.addAll(libros.get(titulo));
        }
        return resultados;
    }

    public List<Libro> buscarPorAutor(String autorNombre) {
        List<Libro> resultados = new ArrayList<>();
        for (List<Libro> lista : libros.values()) {
            for (Libro libro : lista) {
                if (libro.getAutor().getNombre().equalsIgnoreCase(autorNombre)) {
                    resultados.add(libro);
                }
            }
        }
        return resultados;
    }

}

public class BibliotecaApp {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("1. Buscar libros por Título");
            System.out.println("2. Buscar libros por Autor ");
            System.out.println("3. Registrar libro");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título del libro a buscar: ");
                    String titulo = scanner.nextLine();
                    List<Libro> librosPorTitulo = biblioteca.buscarPorTitulo(titulo);

                    if (librosPorTitulo.isEmpty()) {
                        System.out.println("No se encontraron libros del autor: " + titulo);
                    } else {
                        System.out.println("Libros del autor '" + titulo + "':");
                        for (Libro l : librosPorTitulo) {
                            System.out.println(l.getTitulo() + " (Autor: " + l.getAutor().getNombre() + ")");
                        }
                    }
                    break;
                case 2:
                    System.out.print("Nombre del autor del libro a buscar: ");
                    String autorNombre = scanner.nextLine();
                    List<Libro> librosPorAutor = biblioteca.buscarPorAutor(autorNombre);

                    if (librosPorAutor.isEmpty()) {
                        System.out.println("No se encontraron libros del autor: " + autorNombre);
                    } else {
                        System.out.println("Libros del autor '" + autorNombre + "':");
                        for (Libro l : librosPorAutor) {
                            System.out.println(l.getTitulo() + " (Autor: " + l.getAutor().getNombre() + ")");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Nombre del libro: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Autor del libro: ");
                    Autor autor = new Autor(scanner.nextLine());
                    Libro nuevoLibro = new Libro(nombre, autor);
                    biblioteca.registrarLibro(nuevoLibro);
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