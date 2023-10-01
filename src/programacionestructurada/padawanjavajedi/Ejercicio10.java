package programacionestructurada.padawanjavajedi;

public class Ejercicio10 {
    public static void main(String[] args) {
        int opcion = 3;  
        int contador = 1;      
        System.out.println("Menú de Opciones:");
        System.out.println("Opción 1");
        System.out.println("Opción 2");
        System.out.println("Opción 3");

        if(opcion > 3){
            System.out.println("Opción no válida. Por favor, elige una opción válida.");
        } 

        while(contador <= 3){
            if(contador == opcion){
                System.out.println("Has seleccionado la Opción " + opcion);
            }
            contador++;            
        }
    }
}
