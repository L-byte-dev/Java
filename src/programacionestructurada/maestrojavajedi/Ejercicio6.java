package programacionestructurada.maestrojavajedi;

public class Ejercicio6 {
    public static void main(String[] args) {
        char[] palabra = {'R','E','C','O','N','O','C','E','R'};
        boolean esPalindromo = false;
        
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] != palabra[palabra.length - 1 - i]){
                System.out.println("No es un palíndromo");
                break;
            } else {
                esPalindromo = true;
            }
        }

        if (esPalindromo) {
            System.out.println("Es un palíndromo");
        }
    }
}
