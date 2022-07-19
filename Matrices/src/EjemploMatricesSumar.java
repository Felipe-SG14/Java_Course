public class EjemploMatricesSumar {

    public static void main(String[] args) {
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] b = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };

        int[][] c = new int[a.length][a[0].length];

        // Sumando matrices
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Matriz A: ");
        imprimirArr(a);

        System.out.println("Matriz B: ");
        imprimirArr(b);

        System.out.println("Matriz A + B = C: ");
        imprimirArr(c);

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
