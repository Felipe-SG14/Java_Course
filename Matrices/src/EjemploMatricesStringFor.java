public class EjemploMatricesStringFor {
    public static void main(String[] args) {

        // Inicializando
        // String[][] nombres = new String[3][2];
        String[][] nombres = {{"Pepe","Pepa"},{"Josefa","Paco"},{"Lucas","Pancha"}};

        System.out.println("Recorriendo con for normal: ");
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Recorriendo con for-each: ");
        for(String [] renglon : nombres){
            for (String nombre : renglon){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
    }
}
