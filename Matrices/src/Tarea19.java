import java.util.Scanner;

public class Tarea19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la h: ");
        int n = scanner.nextInt();

        if (n > 0){
            int[][] x = new int[n][n];

            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < x[0].length; j++) {
                    // (j == 0) || (i == (int)Math.ceil(x.length/2) || ((i > (int)Math.ceil(x.length/2) && j == x[0].length-1))
                    if ( (j == 0) || (i == (int)Math.ceil(x.length/2)) || (i > (int)Math.ceil(x.length/2) && j == x[0].length-1) ) {
                        x[i][j] = 1;
                    } else {
                        x[i][j] = 0;
                    }
                }
            }

            imprimirArr(x);

        } else {
            System.out.println("No es un tamaño valido ");
        }

    }

    public static void imprimirArr(int[][] arreglo){
        for (int[] ints : arreglo) {
            for (int anInt : ints) {
                System.out.print(Integer.toString(anInt) + " ");
            }
            System.out.println();
        }
    }
}
