import java.util.Arrays;

public class Tarea13 {
    public static void main(String[] args) {

        // Arreglo
        int[] arreglo = {1,2,3,4,5,6,7,8,9,10};

        // Arreglo con las condiciones
        int[] arregloNew = new int[arreglo.length];

        int indiceNew = 0;
        for (int i = 0; i < arreglo.length/2; i++) {
            arregloNew[indiceNew++] = arreglo[arreglo.length -1 -i];
            arregloNew[indiceNew++] = arreglo[i];
        }

        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        System.out.println("Arreglo ordenado: " + Arrays.toString(arregloNew));
    }
}
