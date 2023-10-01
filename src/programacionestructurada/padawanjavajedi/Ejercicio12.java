package programacionestructurada.padawanjavajedi;

public class Ejercicio12 {
    public static void main(String[] args) {
        String equipo1 = "Boca Juniors";
        String equipo2 = "River Plate";
        String entrenador1 = "Jorge Almirón";
        String entrenador2 = "Martín Demichelis";
        String jugador1Equipo1 = "S. Romero";
        String jugador2Equipo1 = "L. Blondel";
        String jugador3Equipo1 = "B. Valdez";
        String jugador4Equipo1 = "N. Valentini";
        String jugador5Equipo1 = "M. Saracchi";
        String jugador6Equipo1 = "J. Campuzano";
        String jugador7Equipo1 = "E. Bullaude";
        String jugador8Equipo1 = "M. Weigandt";
        String jugador9Equipo1 = "J. Ramírez";
        String jugador10Equipo1 = "L. Janson";
        String jugador11Equipo1 = "D. Benedetto";
        String jugador1Equipo2 = "F. Armani";
        String jugador2Equipo2 = "M. Herrera";
        String jugador3Equipo2 = "L. González Pírez";
        String jugador4Equipo2 = "P. Díaz";
        String jugador5Equipo2 = "M. Casco";
        String jugador6Equipo2 = "E. Pérez";
        String jugador7Equipo2 = "N. De la Cruz";
        String jugador8Equipo2 = "I. Fernández";
        String jugador9Equipo2 = "M. Lanzini";
        String jugador10Equipo2 = "E. Barco";
        String jugador11Equipo2 = "S. Roldón";
        int opcion = 1;        
        System.out.println("Menú de Opciones:");
        System.out.println("Ver información del equipo 1");
        System.out.println("Ver información del equipo 2");
        
        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado ver información del equipo 1.");
                System.out.println("Equipo: " + equipo1);
                System.out.println("Entrenador: " + entrenador1);
                System.out.println("Jugadores: ");
                System.out.println(jugador1Equipo1);
                System.out.println(jugador2Equipo1);
                System.out.println(jugador3Equipo1);
                System.out.println(jugador4Equipo1);
                System.out.println(jugador5Equipo1);
                System.out.println(jugador6Equipo1);
                System.out.println(jugador7Equipo1);
                System.out.println(jugador8Equipo1);
                System.out.println(jugador9Equipo1);
                System.out.println(jugador10Equipo1);
                System.out.println(jugador11Equipo1);
                break;
            case 2:
                System.out.println("Equipo: " + equipo2);
                System.out.println("Entrenador: " + entrenador2);
                System.out.println("Jugadores: ");
                System.out.println(jugador1Equipo2);
                System.out.println(jugador2Equipo2);
                System.out.println(jugador3Equipo2);
                System.out.println(jugador4Equipo2);
                System.out.println(jugador5Equipo2);
                System.out.println(jugador6Equipo2);
                System.out.println(jugador7Equipo2);
                System.out.println(jugador8Equipo2);
                System.out.println(jugador9Equipo2);
                System.out.println(jugador10Equipo2);
                System.out.println(jugador11Equipo2);
                break;
            default:
                System.out.println("Opción no válida. Por favor, elige una opción válida.");
        }
    }
}

