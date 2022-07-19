public class EjemploMatricesIdentidad {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((i == j) || ( i==0 || i == matriz.length -1) || (j ==0 || j == matriz[0].length-1) ){
                    matriz[i][j] = 1;
                }
            }
        }

        System.out.println("Matriz identidad");
        imprimirArr(matriz);
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
