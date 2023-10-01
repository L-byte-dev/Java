package programacionestructurada.caballerojavajedi;

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] nombres = {"Federico", "Alejandro", "Ezequiel"};
        int[] edades = {20, 15, 25};
        int mayor = edades[0];
        for (int j : edades) {
            if(j > mayor){
                mayor = j;
            }
        }
        for (int i = 0; i < nombres.length; i++) {
            if (edades[i] >= 18) {
                if (edades[i] == mayor){
                    System.out.println(nombres[i] + " es el mayor, tiene " + edades[i] + " años");
                } else {
                    System.out.println(nombres[i] + " es mayor de edad.");
                }
            } else {
                System.out.println(nombres[i] + " es menor de edad, por eso no se lo muestra por pantalla.");
            }
        }
    }
}
