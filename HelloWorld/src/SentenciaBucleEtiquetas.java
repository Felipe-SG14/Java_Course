public class SentenciaBucleEtiquetas {
    public static void main(String[] args) {


        // Declarando etiquetas

        bucle1:
        for (int i=0 ; i<5 ; i++){
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2){
                    // El continue apunta a la iteracion inmediata
                    continue;
                } else {
                    System.out.print("[i = " + i + ", j = " + j + "], ");
                }
            }
        }

        System.out.println("\n=========================");
        etiqueta:
        for (int i=0 ; i<5 ; i++){
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2){
                    // El continue apunta a la iteracion inmediata
                    break etiqueta;
                } else {
                    System.out.print("[i = " + i + ", j = " + j + "], ");
                }
            }
        }
    }
}
