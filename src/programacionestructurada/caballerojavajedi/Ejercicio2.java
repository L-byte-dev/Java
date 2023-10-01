package programacionestructurada.caballerojavajedi;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int menor = numeros[0];
        int mayor = numeros[0];
        for (int i : numeros) {
            if(i < menor){
                menor = i;
            }
            if(i > mayor){
                mayor = i;
            }
        }
        System.out.println("El menor número es " + menor);
        System.out.println("El menor número es " + mayor);
    }
}
