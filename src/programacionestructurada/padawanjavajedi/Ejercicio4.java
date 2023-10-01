package programacionestructurada.padawanjavajedi;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        for (int impares : numeros) {
            if(impares % 2 != 0){
                System.out.println(impares);
            }
        }
    }
}
