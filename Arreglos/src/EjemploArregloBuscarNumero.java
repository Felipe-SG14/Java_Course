import java.util.Arrays;
import java.util.Scanner;

public class EjemploArregloBuscarNumero {
    public static void main(String[] args) {

        // Arreglo original
        int[] arreglo = {1,7,4,6,2,10,8,3};
        System.out.println("El arreglo es: " + Arrays.toString(arreglo));

        // Toma del numero
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número a buscar: ");
        int intBuscar = scanner.nextInt();
        int indice = 0;
        boolean encontrado = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == intBuscar){
                indice = i;
                encontrado = true;
            }
        }

        if (encontrado){
            System.out.println("El numero a buscar es " + intBuscar + " y se encuentra en el indice " + indice);
        } else{
            System.out.println("El numero a buscar no se encuentra en el arreglo...");
        }


    }
}
