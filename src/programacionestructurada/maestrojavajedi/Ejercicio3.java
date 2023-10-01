package programacionestructurada.maestrojavajedi;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] arreglo1 = {1,2,3};
        int[] arreglo2 = {4,5,6};
        int tamañoArreglo3 = arreglo1.length + arreglo2.length;
        int[] arreglo3 = new int[tamañoArreglo3];
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo3[i] = arreglo1[i];
        }
        for (int i = 0; i < arreglo2.length; i++) {
            arreglo3[arreglo1.length + i] = arreglo2[i];
        }
        for (int i : arreglo3) {
            System.out.print(i + " ");
        }
    }
}
