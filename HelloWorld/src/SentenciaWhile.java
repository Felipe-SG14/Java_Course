public class SentenciaWhile {
    public static void main(String[] args) {

        int i = 0;

        // Declarando un while
        while (i <= 5){
            System.out.println(i);
            i++;
        }

        i = 0;
        boolean prueba = true;

        // While
        while (prueba){
            if (i == 7) {
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        // El while primero evalua y luego ejecuta el scope
        prueba = false;
        while (prueba){
            System.out.println("Nunca se ejecuta");
        }

        // Utilizando do While
        // Primero ejecuta y despues evalua
        prueba = false;
        do {
            System.out.println("Se ejecuta una vez!");
        } while (prueba);

        prueba = true;
        i=0;
        do {
            if (i == 10){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        } while (prueba);

    }
}
