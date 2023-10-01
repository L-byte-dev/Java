package programacionestructurada.maestrojavajedi;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5};
        int posicion = 2;
        int N = 2;

        if (N >= arreglo.length) {
            System.out.println("La cantidad de traslados es mayor o igual al tamaño del arreglo.");
            return;
        }
        int elemento = arreglo[posicion];
        int nuevaPosicion = (posicion + N) % arreglo.length;
        arreglo[nuevaPosicion] = elemento;
        System.out.print("Arreglo después del traslado: ");
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
    }
}
