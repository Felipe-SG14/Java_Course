public class EjemploMatricesTransponerMatrices {
    public static void main(String[] args) {

        // Matriz original (3,1)
        int[][] matrix = {
                {1,2},
                {2,3},
                {3,4},
                {4,5}
        };

        //Matriz Transpuesta (1,3)
        int[][] matrixT = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrixT.length; i++) {
            for (int j = 0; j < matrixT[i].length; j++) {
                matrixT[i][j] = matrix[j][i];
            }
        }

        // Matriz original
        System.out.println("Matrix original: ");
        imprimirArr(matrix);
        System.out.println("Matriz Transpuesta: ");
        imprimirArr(matrixT);


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
