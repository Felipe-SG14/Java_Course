import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EjemploArreglos {
    public static void main(String[] args) {
        
        // Declaración del arreglo
        // Si no se inicializa los valores, por defecto son null
        String[] productos = {"A","D","F","Z","H"};
        int[] numbers = {1,5,4,8,2,7,4,6,5,9};

        // Ordenando arreglos

        Arrays.sort(numbers);
        Arrays.sort(productos);

        //Viendo resultado
        for (int number : numbers) {
            System.out.print(number + ",");
        }
        System.out.println();
        // Viendo resultado
        for (String nombre : productos) {
            System.out.print(nombre + ",");
        }
        System.out.println();
        // Invertir un arreglo de forma manual
        invertirArreglo(numbers);
        System.out.println("Arreglo volteado: " + Arrays.toString(numbers));

        // Utilizando la API de collections
        // Collections.reverse(Arrays.asList(numbers));
        // System.out.println("Arreglo volteado con colletions: " + Arrays.toString(numbers));
    }

    public static void invertirArreglo(int[] arreglo){
        for (int i = 0; i < arreglo.length/2; i++) {
            int auxiliar = arreglo[arreglo.length-1-i];
            arreglo[arreglo.length-1-i] = arreglo[i];
            arreglo[i] = auxiliar;
        }

    }
}
