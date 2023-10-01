package programacionestructurada.caballerojavajedi;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] listaNumeros = {1, 2, 3, 4, 5};
        int numeroBuscado = 3;
        boolean encontrado = false;
        for(int i = 0; i < listaNumeros.length; i++){
            if(numeroBuscado == listaNumeros[i]){
                encontrado = true;
                break;
            } 
        }
        if(encontrado){
            System.out.println("El número " + numeroBuscado + " fue encontrado en la lista");
        } else {
            System.out.println("El número " + numeroBuscado + " no fue encontrado en la lista");
        }
    }
}
