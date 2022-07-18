import java.util.Arrays;
import java.util.Collections;

public class ArreglosCombinados {
    public static void main(String[] args) {

        // Inicialización de arreglos
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = {5,10,15,20,25,30,35,40,45,50};
        int[] c = new int[20];

        // Llenando tercer arreglo con dimensiones adecuadas
        int aux = 0;
        for (int i = 0; i < a.length; i+=2) {
            for (int j = 0; j < 2; j++) {
                c[aux++]=a[i+j];
            }
            for (int j = 0; j < 2; j++) {
                c[aux++]=b[i+j];
            }
        }
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
        System.out.println("c = " + Arrays.toString(c));
    }
}
