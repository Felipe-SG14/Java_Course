import java.util.Scanner;

public class Tarea18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la X: ");
        int n = scanner.nextInt();

        if (n > 0){
            String[][] x = new String[n][n];

            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < x[0].length; j++) {
                    if ( (i==j) || (j == x[0].length-1-i) ){
                        x[i][j] = "X";
                    } else {
                        x[i][j] = "_";
                    }
                }
            }

            imprimirArr(x);

        } else {
            System.out.println("No es un tamaño valido ");
        }

    }

    public static void imprimirArr(String[][] arreglo){
        for (String[] ints : arreglo) {
            for (String anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
    }
}
