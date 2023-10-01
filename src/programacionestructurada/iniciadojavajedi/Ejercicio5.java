package programacionestructurada.iniciadojavajedi;

public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        int N = 10;
        int suma = 0;
        for (int i = 1; i <= N; i++) {
            suma += i;
        }
        System.out.println("La suma de los primeros " + N + " números naturales es: " + suma);
    }
}
