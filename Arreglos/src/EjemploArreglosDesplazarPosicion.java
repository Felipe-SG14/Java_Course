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
        System.out.println("Insetando un 2 en la posicion 5:");
        insertarDer(arreglo,2,5);
        System.out.println("Arreglo con valor insertado: " + Arrays.toString(arreglo));
        int[] nuevoArray = eliminarElemento(arreglo,2);
        System.out.println("Arreglo con elemento en el indice 2 borrado es: " + Arrays.toString(nuevoArray));
        int[] nuevoArr = insertarElemento(nuevoArray,10,4);
        System.out.println("Insertando un 10 en el indice 4: " + Arrays.toString(nuevoArr));
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

    public static void insertarDer(int[] arreglo, int elemento, int posicion){
        if( posicion == arreglo.length-1 ){
            arreglo[arreglo.length-1] = elemento;
        } else {
            for (int i = arreglo.length - 2; i >= posicion ; i--) {
                arreglo[i+1] = arreglo[i];
            }
            arreglo[posicion] = elemento;
        }
    }

    public static int[] eliminarElemento(int[] arreglo, int indice){
        int[] arregloNew = new int[arreglo.length-1];
        int indiceNew = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (i != indice) {
                arregloNew[indiceNew++] = arreglo[i];
            }
        }
        return arregloNew;
    }

    public static int[] insertarElemento(int[] arreglo, int elemento, int posicion){
        int[] arregloNew = new int[arreglo.length+1];
        int indiceNew = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (i != posicion){
                arregloNew[indiceNew++] = arreglo[i];
            } else {
                arregloNew[indiceNew++] = elemento;
                arregloNew[indiceNew] = arreglo[i];
                indiceNew++;
            }
        }
        return arregloNew;
    }

}
