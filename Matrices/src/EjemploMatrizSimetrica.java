public class EjemploMatrizSimetrica {
    public static void main(String[] args) {

        int[][] matriz = {
                {1,2,3,3},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };

        boolean matrixIsSim = true;
        // Comprobacion de simetria

        mainLoop:
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ( matriz[i][j] != matriz[j][i]){
                    matrixIsSim = false;
                    break mainLoop;
                }
            }
        }
        System.out.println("La matriz a analizar es la siguiente: ");
        imprimirArr(matriz);
        if (matrixIsSim){
            System.out.println("La matriz es simetrica...");
        } else {
            System.out.println("La matriz no es simetrica...");
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
