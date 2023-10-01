package programacionestructurada.caballerojavajedi;

public class Ejercicio5 {
    public static void main(String[] args) {
        double[] arreglo1 = {5.5, 3.5, 6.8, 7.5, 2.3};
        double[] arreglo2 = {2.5, 9.5, 4.2, 6.4, 7.4};
        int longitudRecorte = 3;
        double[] arreglo1Recortado = new double[longitudRecorte];
        double[] arreglo2Recortado = new double[longitudRecorte];

        for (int i = 0; i < longitudRecorte; i++) {
            arreglo1Recortado[i] = arreglo1[i];
            arreglo2Recortado[i] = arreglo2[i];
        }
        double[] arreglo3 = new double[longitudRecorte];

        for (int i = 0; i < longitudRecorte; i++) {
            arreglo3[i] = arreglo1Recortado[i] - arreglo2Recortado[i];
            if (arreglo3[i] < 0) {
                arreglo3[i] = 0;
            }
        }
        System.out.println("Arreglo 3:");
        
        for (int i = 0; i < longitudRecorte; i++) {
            System.out.println(arreglo3[i]);
        }
    }
}
