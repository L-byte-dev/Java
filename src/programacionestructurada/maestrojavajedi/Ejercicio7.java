package programacionestructurada.maestrojavajedi;

public class Ejercicio7 {
    public static void main(String[] args) {
        String equipo1 = "Boca Juniors";
        String equipo2 = "River Plate";
        String entrenador1 = "Jorge Almirón";
        String entrenador2 = "Martín Demichelis";
        String[] jugadoresEquipo1 = {"S. Romero", "L. Blondel", "B. Valdez", "N. Valentini", "M. Saracchi", "J. Campuzano", "E. Bullaude", "M. Weigandt", "J. Ramírez", "L. Janson", "D. Benedetto"};
        String[] jugadoresEquipo2 = {"F. Armani", "M. Herrera", "L. González Pírez", "P. Díaz", "M. Casco", "E. Pérez", "N. De la Cruz", "I. Fernández", "M. Lanzini", "E. Barco", "S. Roldón"};

        int opcion = 1;        
        System.out.println("Menú de Opciones:");
        System.out.println("Ver información del equipo 1");
        System.out.println("Ver información del equipo 2");
        
        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado ver información del equipo 1.");
                System.out.println("Equipo: " + equipo1);
                System.out.println("Entrenador: " + entrenador1);
                System.out.print("Jugadores: ");
                for (String i : jugadoresEquipo1) {
                    System.out.println(i);            
                }
                break;
            case 2:
                System.out.println("Has seleccionado ver información del equipo 2.");
                System.out.println("Equipo: " + equipo2);
                System.out.println("Entrenador: " + entrenador2);
                System.out.print("Jugadores: ");
                for (String i : jugadoresEquipo2) {
                    System.out.println(i);            
                }    
                break;
            default:
                System.out.println("Opción no válida. Por favor, elige una opción válida.");
        }
    }
}
