package programacionestructurada.padawanjavajedi;

public class Ejercicio8 {
    public static void main(String[] args) {
        String[] nombres = {"Federico", "Alejandro", "Ezequiel"};
        int[] edades = {20, 15, 25};

        for (int i = 0; i < nombres.length; i++) {
            if (edades[i] >= 18) {
                System.out.println(nombres[i] + " es mayor de edad.");
            } else {
                System.out.println(nombres[i] + " es menor de edad, por eso no se lo muestra por pantalla.");
            }
        }
    }
}
