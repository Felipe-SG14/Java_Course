import java.util.Scanner;

public class Tarea7 {
    public static void main(String[] args) {

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Variables
        boolean esCorrecto = false;
        int longitud = 0;

        // Menu
        do {
            System.out.print("Ingresa el numero de datos: ");
            longitud = scanner.nextInt();

            if (longitud < 10){
                System.out.println("Ingresa una longitud mayor a 10...");
            } else {
                esCorrecto = true;
            }
        } while (!esCorrecto);

        //Arreglo de datos
        int[] arreglo = new int[longitud];

        // Ingreso de datos
        for (int i = 0; i < longitud; i++) {
            System.out.print("Ingresa el dato numero " + i + ": ");
            arreglo[i] = scanner.nextInt();
        }

        // Se obtiene el mínimo
        int minimo = minValue(arreglo);
        System.out.println("minimo = " + minimo);
        if (minimo < 10){
            System.out.println("El numero menor es menor que 10!");
        } else {
            System.out.println("El numero menor es igual o mayor que 10!");
        }

    }

    public static int minValue(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if ( array[i] < min ){
                min = array[i];
            }
        }
        return min;
    }

}
