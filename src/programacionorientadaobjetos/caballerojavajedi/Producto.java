package programacionorientadaobjetos.caballerojavajedi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadStock;

    public Producto(String nombre, double precio, int cantidadStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad en stock: " + cantidadStock);
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public static void main(String[] args) {
        Map<String, Producto> inventario = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("1. Agregar Producto");
            System.out.println("2. Actualizar Producto");
            System.out.println("3. Consultar Productos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Cantidad en stock: ");
                    int cantidadStock = scanner.nextInt();
                    Producto producto = new Producto(nombre, precio, cantidadStock);
                    inventario.put(nombre, producto);
                    break;
                case 2:
                    if (inventario.isEmpty()) {
                        System.out.println("No hay productos en el inventario");
                    } else {
                        System.out.print("Ingrese el nombre del producto a actualizar: ");
                        String actualizarProducto = scanner.nextLine();
                        if (inventario.containsKey(actualizarProducto)) {
                            Producto productoExistente = inventario.get(actualizarProducto);
                            System.out.print("Ingrese el precio: ");
                            double nuevoPrecio = scanner.nextDouble();
                            productoExistente.setPrecio(nuevoPrecio);
                            System.out.print("Ingrese la cantidad en stock: ");
                            int cantidad = scanner.nextInt();
                            productoExistente.setCantidadStock(cantidad);
                            System.out.println("Producto actualizado correctamente.");
                        } else {
                            System.out.println("El producto no existe en el inventario.");
                        }
                    }
                    break;
                case 3:
                    if (inventario.isEmpty()) {
                        System.out.println("No hay productos en el inventario");
                    }
                    else {
                        System.out.println("Inventario:");
                        for (Producto prod : inventario.values()) {
                            prod.imprimirDatos();
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