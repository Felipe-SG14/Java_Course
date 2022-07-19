import java.util.Arrays;

public class EjemploArreglosDesplazarPosicion {
    public static void main(String[] args) {

        int[] arreglo = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        moverDer(arreglo);
        moverDer(arreglo);
        System.out.println("Arreglo desplazado 2  veces a la derecha: " + Arrays.toString(arreglo));
        moverIzq(arreglo);
        System.out.println("Arreglo desplazado 1 vez a la izquierda: " + Arrays.toString(arreglo));
    }

    public static void moverDer(int[] arreglo){
        int ultimo = arreglo[arreglo.length-1];
        for (int i = arreglo.length -2 ; i >= 0 ; i--) {
            arreglo[i+1] = arreglo[i];
        }
        arreglo[0] = ultimo;
    }

    public static void moverIzq(int[] arreglo){
        int primero = arreglo[0];
        for (int i = 0 ; i < arreglo.length - 1 ; i++) {
            arreglo[i] = arreglo[i+1];
        }
        arreglo[arreglo.length-1] = primero;
    }

}
