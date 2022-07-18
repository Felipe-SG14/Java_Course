import java.util.Arrays;

public class ArregloParesImpares {
    public static void main(String[] args) {

        //Arreglo
        int[] a = {1,2,3,4,5,6,7,8,9,10,12};

        int totalPar   = 0;
        int totalImpar = 0;

        // Conteo de pares e impares
        for (int j : a) {
            if (j % 2 == 0) {
                totalPar++;
            } else {
                totalImpar++;
            }
        }

        // Declarando arreglos
        int[] arrPar   = new int[totalPar];
        int[] arrImpar = new int[totalImpar];

        int jPar = 0;
        int jImpar = 0;
        for (int j : a) {
            if (j % 2 == 0) {
                arrPar[jPar++] = j;
            } else {
                arrImpar[jImpar++] = j;
            }
        }

        System.out.println("Arreglo original: " + Arrays.toString(a));
        System.out.println("Arreglo de pares: " + Arrays.toString(arrPar));
        System.out.println("Arreglo de impares: " + Arrays.toString(arrImpar));

    }
}
