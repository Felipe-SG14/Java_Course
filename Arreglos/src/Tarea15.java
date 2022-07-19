import java.util.Scanner;

public class Tarea15 {
    public static void main(String[] args) {

        // Lectura de numeros
        int[] arreglo = new int[7];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Dame el elemento " + i + " del arreglo: ");
            arreglo[i] = scanner.nextInt();
        }

        // Estadística de los datos
        int numPositivos = 0;
        int numPositivosCount = 0;
        int numNegativos = 0;
        int numNegativosCount = 0;
        int numCeros = 0;

        // Obteniendo estadistica
        for (int numero:arreglo) {
            if ( numero > 0 ){
                numPositivos+=numero;
                numPositivosCount++;
            } else if (numero<0) {
                numNegativos+=numero;
                numNegativosCount++;
            } else {
                numCeros ++;
            }
        }

        if ( numPositivosCount == 0 ){
            System.out.println("No hay numeros positivos");
        } else {
            System.out.println("El promedio de los numeros positivos es :" + (double)numPositivos/numPositivosCount);
        }

        if (numNegativosCount == 0){
            System.out.println("No hay numeros negativos");
        } else {
            System.out.println("El promedio de los numeros negativos es: " + (double)numNegativos/numNegativosCount);
        }
        System.out.println("La cantidad de ceros en el arreglo es la siguiente: " + numCeros);
    }
}
