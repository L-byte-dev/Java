package programacionestructurada.caballerojavajedi;

public class Ejercicio4 {
    public static void main(String[] args) {
        double[] numeros = {9.8, 7.6, 5.4, 3.2, 1.0};
        int n = numeros.length;
        boolean intercambiado;
        
        do {
            intercambiado = false;
            for (int i = 1; i < n; i++) {
                if (numeros[i - 1] > numeros[i]) {
                    double temp = numeros[i - 1];
                    numeros[i - 1] = numeros[i];
                    numeros[i] = temp;
                    intercambiado = true;
                }
            }
        } while (intercambiado);
        for (double elemento : numeros) {
            System.out.print(elemento + " ");
        }
    }
}
