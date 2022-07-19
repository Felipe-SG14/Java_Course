import java.util.Arrays;
public class Tarea14 {
    public static void main(String[] args) {

        int[] arreglo = {14,33,15,36,78,21,43};
        System.out.println("El arreglo es: " + Arrays.toString(arreglo));
        System.out.println("El mayor valor es: " + maxValue(arreglo));
    }

    public static int maxValue(int[] arreglo){
        int max = arreglo[0];
        for (int i = 0; i < arreglo.length; i++) {
            if (max < arreglo[i]){
                max = arreglo[i];
            }
        }
        return max;
    }
}
