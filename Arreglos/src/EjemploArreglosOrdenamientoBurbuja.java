import java.util.Arrays;

public class EjemploArreglosOrdenamientoBurbuja {
    public static void main(String[] args) {
        
        // Declaración del arreglo
        // Si no se inicializa los valores, por defecto son null
        String[] productos = {"A","D","F","Z","H"};
        int[] numbers = {1,5,4,8,2,7,4,6,5,9};

        // Ordenando arreglos
        // Arrays.sort(numbers);
        // Arrays.sort(productos);

        // Metodo burbuja
        /*
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]){
                    int auxiliar = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = auxiliar;
                }
            }
        }
         */

        // Algoritmo burbuja optimizado
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length -1 -i ; j++) {
                if (numbers[j+1] < numbers[j]){
                    int auxiliar = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = auxiliar;
                }
            }
        }

        System.out.println("Arreglo ordenado: " + Arrays.toString(numbers));

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
