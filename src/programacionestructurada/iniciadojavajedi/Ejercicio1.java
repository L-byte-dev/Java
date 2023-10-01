package programacionestructurada.iniciadojavajedi;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        int altura = 3; 
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
