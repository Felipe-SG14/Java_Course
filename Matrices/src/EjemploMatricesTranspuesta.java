public class EjemploMatricesTranspuesta {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        System.out.println("La matriz a transponer es:");
        imprimirArr(matrix);
        // Transponiendo matriz
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int auxiliar = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = auxiliar;
            }
        }

        System.out.println("La matriz transpuesta es la siguiente: ");
        imprimirArr(matrix);
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
