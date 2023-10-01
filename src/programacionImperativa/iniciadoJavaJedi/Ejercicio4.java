package programacionimperativa.iniciadojavajedi;

public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        int numero1 = 60;
        int numero2 = 30;
        
        int suma = numero1 + numero2;
        int divisible = (numero1 % numero2 == 0) ? 1 : 0;
        
        System.out.println("La suma de los números es: " + suma);
        System.out.println("El primer número " + (divisible == 1 ? "es" : "no es") + " divisible por el segundo número.");
    }
}
