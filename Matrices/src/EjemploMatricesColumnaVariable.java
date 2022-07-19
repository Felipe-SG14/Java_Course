public class EjemploMatricesColumnaVariable {
    public static void main(String[] args) {

        // Declarando matriz
        int[][] matriz = new int[3][];


        // Definiendo columnas variables
        matriz[0] = new int[2];
        matriz[1] = new int[3];
        matriz[2] = new int[4];

        System.out.println("Longitud de matriz: " + matriz.length);
        System.out.println("Fila 0 : " + matriz[0].length);
        System.out.println("Fila 1 : " + matriz[1].length);
        System.out.println("Fila 2 : " + matriz[2].length);

        // Llenando con datos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = j+1;
            }
        }

        // Mostrando matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(Integer.toString(matriz[i][j]) + '\t');
            }
            System.out.println();
        }
    }
}
