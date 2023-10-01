package programacionestructurada.iniciadojavajedi;

public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
        System.out.println("Calculadora de Promedio de Notas");
        double nota1 = 5d;
        double nota2 = 6d;
        double nota3 = 10d;
        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.print("Notas: ");
        System.out.print(nota1 + ", ");
        System.out.print(nota2 + ", ");
        System.out.print(nota3);
        System.out.println("\nPromedio: " + promedio);
        if (promedio >= 7) {
            System.out.println("¡Aprobaste!");
        } else {
            double puntosFaltantes = 7.0 - promedio;
            System.out.println("No aprobaste.");
            System.out.println("Necesitas " + puntosFaltantes + " puntos más para aprobar.");
        }
    }    
}
