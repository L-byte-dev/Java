package programacionimperativa.caballerojavajedi;


public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        double conversion = 0.0027d;
        double pesos = 2700d;
        double euros = pesos * conversion;
        System.out.println("El equivalente en euros es: " + euros);
    }
}