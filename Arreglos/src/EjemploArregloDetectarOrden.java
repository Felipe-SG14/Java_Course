import java.util.Scanner;

public class EjemploArregloDetectarOrden {
    public static void main(String[] args) {

        int[] a = new int[7];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 7 números: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        // Comparando con valores para identificar orden
        boolean ascendente = false;
        boolean descendente = false;
        for (int i = 0; i < a.length-1; i++) {
            if ( a[i] > a[i+1] ){
                descendente = true;
            }
            if ( a[i] < a[i+1] ){
                ascendente = true;
            }
        }

        if (ascendente && descendente){
            System.out.println("Arreglo desordenado");
        } else if (!ascendente && !descendente) {
            System.out.println("Todos son iguales");
        } else if (ascendente && !descendente) {
            System.out.println("El arreglo esta ordenado de forma ascendente");
        } else {
            System.out.println("El arreglo esta ordenado de formas descendente");
        }
    }
}
