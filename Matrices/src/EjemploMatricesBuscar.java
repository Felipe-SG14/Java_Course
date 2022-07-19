import java.util.Arrays;

public class EjemploMatricesBuscar {
    public static void main(String[] args) {

        // Matriz de 4x4
        int[][] matrizDeEnteros ={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        // Int buscar
        int buscar = 30;
        boolean encontrado = false;
        int[] indices = new int[2];

        // Arreglo original
        System.out.println("El arreglo original es: ");
        imprimirArr(matrizDeEnteros);

        // Buscando el elemento
        mainLoop:
        for (int i = 0; i < matrizDeEnteros.length; i++) {
            for (int j = 0; j < matrizDeEnteros[i].length; j++) {
                if (matrizDeEnteros[i][j] == buscar){
                    encontrado = true;
                    indices[0] = i;
                    indices[1] = j;
                    break mainLoop;
                }
            }
        }

        if (encontrado){
            System.out.println("El elemento " + buscar + " se encontro en [i,j] =" + Arrays.toString(indices));
        } else {
            System.out.println("El numero a buscar no se encontro en la matriz...");
        }

    }

    public static void imprimirArr(int[][] arreglo){
        for (int[] ints : arreglo) {
            for (int anInt : ints) {
                System.out.print(Integer.toString(anInt) + '\t');
            }
            System.out.println();
        }
    }
}
