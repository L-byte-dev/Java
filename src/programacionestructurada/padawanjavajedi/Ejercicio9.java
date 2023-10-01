package programacionestructurada.padawanjavajedi;

public class Ejercicio9 {
    public static void main(String[] args) {
        int opcion = 3;        
        System.out.println("Menú de Opciones:");
        System.out.println("Opción 1");
        System.out.println("Opción 2");
        System.out.println("Opción 3");
        
        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado la Opción 1.");
                break;
            case 2:
                System.out.println("Has seleccionado la Opción 2.");
                break;
            case 3:
                System.out.println("Has seleccionado la Opción 3.");
                break;
            default:
                System.out.println("Opción no válida. Por favor, elige una opción válida.");
        }
    }
}
