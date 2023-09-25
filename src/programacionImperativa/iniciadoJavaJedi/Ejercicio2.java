package programacionImperativa.iniciadoJavaJedi;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        int numero1 = 20;
        int numero2 = 30;
        int resultado = numero1 + numero2;
        boolean paridad = resultado % 2 == 0;
        if (paridad)
            System.out.println("El resultado es " + resultado + " y es par");
        else
            System.out.println("El resultado es " + resultado + " y es impar");
    }
}
