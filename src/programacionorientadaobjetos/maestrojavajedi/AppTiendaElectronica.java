package programacionorientadaobjetos.maestrojavajedi;

import java.util.*;

class ProductoElectronico {
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadStock;

    public ProductoElectronico(String nombre, String descripcion, double precio, int cantidadStock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void actualizarStock(int cantidad) {
        cantidadStock += cantidad;
    }
}

class Cliente {
    private String nombre;
    private String direccion;
    private List<ProductoElectronico> productosComprados;

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.productosComprados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<ProductoElectronico> getProductosComprados() { return productosComprados; }

    public void productosComprados() {
        System.out.print("Productos comprados: ");
        for (ProductoElectronico productosComprados : productosComprados) {
            System.out.println(productosComprados.getNombre() + " ");
        }
    }

    public void agregarCompra(ProductoElectronico producto) {
        productosComprados.add(producto);
    }
}

class TiendaElectronica {
    private List<ProductoElectronico> listaProductos;
    private List<Cliente> listaClientes;

    public TiendaElectronica() {
        listaProductos = new ArrayList<>();
        listaClientes = new ArrayList<>();
    }

    public List<ProductoElectronico> getListaProductos() {
        return listaProductos;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void listaProductos() {
        for (ProductoElectronico productoElectronico : listaProductos) {
            System.out.println("Nombre: " + productoElectronico.getNombre());
            System.out.println("Descripción: " + productoElectronico.getDescripcion());
            System.out.println("Precio: " + productoElectronico.getPrecio());
            System.out.println("Cantidad en stock: " + productoElectronico.getCantidadStock());
        }
    }

    public void listaClientes() {
        for (Cliente cliente : listaClientes) {
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Dirección: " + cliente.getDireccion());
            if (!cliente.getProductosComprados().isEmpty()){
                cliente.productosComprados();
            }
        }
    }

    public void agregarProducto(ProductoElectronico productoElectronico) {
        listaProductos.add(productoElectronico);
    }

    public void registrarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public Cliente buscarCliente(String nombre) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombre)) {
                return cliente;
            }
        }
        return null;
    }

    public ProductoElectronico buscarProducto(String nombre) {
        for (ProductoElectronico productoElectronico : listaProductos) {
            if (productoElectronico.getNombre().equalsIgnoreCase(nombre)) {
                return productoElectronico;
            }
        }
        return null;
    }

    public void venderProducto(Cliente cliente, ProductoElectronico productoElectronico, int cantidadVender) {
        if ((productoElectronico.getCantidadStock() - cantidadVender) >= 0) {
            productoElectronico.actualizarStock(-cantidadVender);
            cliente.agregarCompra(productoElectronico);
            System.out.println("Venta realizada exitosamente");
        } else {
            System.out.println("No hay suficiente stock del producto");
        }
    }
}

public class AppTiendaElectronica {
    public static void main(String[] args) {
        TiendaElectronica tiendaElectronica = new TiendaElectronica();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("1. Agregar productos al inventario");
            System.out.println("2. Registrar nuevos clientes");
            System.out.println("3. Realizar venta");
            System.out.println("4. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombreProducto = scanner.nextLine();
                    System.out.print("Descripcion: ");
                    String descripcionProducto = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Cantidad en stock: ");
                    int cantidadStock = scanner.nextInt();
                    ProductoElectronico productoElectronico = new ProductoElectronico(nombreProducto, descripcionProducto, precio, cantidadStock);
                    tiendaElectronica.agregarProducto(productoElectronico);
                    System.out.println("Producto agregado exitosamente");
                    break;
                case 2:
                    System.out.print("Nombre: ");
                    String nombreCliente = scanner.nextLine();
                    System.out.print("Direccion: ");
                    String direccionCliente = scanner.nextLine();
                    Cliente cliente = new Cliente(nombreCliente, direccionCliente);
                    tiendaElectronica.registrarCliente(cliente);
                    System.out.println("Cliente registrado exitosamente");
                    break;
                case 3:
                    System.out.println("Clientes: ");
                    if (tiendaElectronica.getListaClientes().isEmpty()) {
                        System.out.println("No hay clientes");
                        break;
                    }
                    tiendaElectronica.listaClientes();
                    System.out.println("\nEscriba el nombre del cliente");
                    String buscarCliente = scanner.nextLine();
                    Cliente clienteComprador = tiendaElectronica.buscarCliente(buscarCliente);
                    if (clienteComprador == null) {
                        System.out.println("No se ha encontrado un cliente con ese nombre.");
                        break;
                    }
                    System.out.println("Productos: ");
                    if (tiendaElectronica.getListaProductos().isEmpty()) {
                        System.out.println("No hay productos");
                        break;
                    }
                    tiendaElectronica.listaProductos();
                    System.out.println("Escriba el nombre del producto");
                    String BuscarProducto = scanner.nextLine();
                    ProductoElectronico productoVender = tiendaElectronica.buscarProducto(BuscarProducto);
                    if (productoVender == null) {
                        System.out.println("No se ha encontrado un producto con ese nombre.");
                        break;
                    }
                    System.out.println("Escriba la cantidad: ");
                    int cantidadVender = scanner.nextInt();
                    if (cantidadVender <= 0) {
                        System.out.println("La cantidad ingresada debe ser mayor que cero");
                        break;
                    }
                    tiendaElectronica.venderProducto(clienteComprador, productoVender, cantidadVender);
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