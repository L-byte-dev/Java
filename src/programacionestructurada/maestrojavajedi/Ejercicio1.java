package programacionestructurada.maestrojavajedi;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int entero = 5;
        boolean encontrado = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == entero) {
                for (int j = i; j < arreglo.length - 1; j++) {
                    arreglo[j] = arreglo[j + 1];
                }
                encontrado = true;
                break;
            }
        }        
        if (encontrado) {
            int[] nuevoArreglo = new int[arreglo.length - 1];
            for (int i = 0; i < nuevoArreglo.length; i++) {
                nuevoArreglo[i] = arreglo[i];
            }
            System.out.println("El número " + entero + " se ha encontrado y eliminado.");
            System.out.print("Nuevo arreglo: ");
            for (int i : nuevoArreglo) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("El número " + entero + " no se ha encontrado en el arreglo.");
        }
    }
}