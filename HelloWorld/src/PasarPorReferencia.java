public class PasarPorReferencia {
    public static void main(String[] args) {

        // Toda variable primitiva se pasar por valor
        // En el método main se mantiene intacto el valor
        int[] edad = {10,11,12};
        System.out.println("Iniciamos el método main");
        for(int i : edad){
            System.out.println(i);
        }
        System.out.println("Antes de llamar al metodo test");
        test(edad);
        System.out.println("Despues de llamar el método test");
        for(int i : edad){
            System.out.println(i);
        }
        System.out.println("Finaliza el metodo main");

    }

    public static void test(int[] edadArr){
        System.out.println("Iniciamos el método test");
        for(int i =0; i < edadArr.length ; i++){
            edadArr[i] += 20;
        }
        System.out.println("Finaliza el método test");
    }
}
