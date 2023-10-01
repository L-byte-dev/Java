package programacionestructurada.maestrojavajedi;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] arreglo = {1,2,3};
        int[] arregloInvertido = new int[arreglo.length];
        
        for (int i = 0; i < arreglo.length; i++) {
            arregloInvertido[i] = arreglo[arreglo.length - 1 - i];
        }
        System.out.print("Arreglo invertido: ");
        for (int i : arregloInvertido) {
            System.out.print(i + " ");
        }
    }
}
