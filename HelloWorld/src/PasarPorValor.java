public class PasarPorValor {
    public static void main(String[] args) {

        // Toda variable primitiva se pasar por valor
        // En el método main se mantiene intacto el valor
        Integer i = 10;
        System.out.println("Iniciamos el método main con i = " + i);

        test(i);

        System.out.println("Finaliza el metodo main con i = " + i);

    }

    public static void test(Integer i){
        System.out.println("Iniciamos el método test con i = "+i);
        i = 35;
        System.out.println("Finaliza el método test con i = " + i);
    }
}
