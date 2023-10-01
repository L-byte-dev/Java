package programacionestructurada.iniciadojavajedi;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        String amigo1 = "Ezequiel";
        String amigo2 = "Elías";
        String amigo3 = "Marcelo";
        String[] amigos = {amigo1,amigo2,amigo3};
        for (String lista : amigos) {
            System.out.println(lista);            
        }
    }
}