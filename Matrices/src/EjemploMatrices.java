import java.util.Arrays;

public class EjemploMatrices {
    public static void main(String[] args) {

        // Declaracion de matrix bidimensional

        int[][] numeros = new int[2][4];
        
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;

        numeros[1][0] = 11;
        numeros[1][1] = 12;
        numeros[1][2] = 13;
        numeros[1][3] = 14;
        
        // Datos de la matriz
        System.out.println("Numero de filas: " + numeros.length);
        System.out.println("Numero de columnas: " + numeros[0].length);

        // Accediento al ultimo elemento
        int primero = numeros[0][0];
        System.out.println("primero = " + primero);
        int ultimo = numeros[numeros.length-1][numeros[0].length-1];
        System.out.println("ultimo = " + ultimo);
    }
}
