public class EjemploArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {

        // Arreglo de números
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0 ; i < numbers.length/2 ; i++){
            System.out.println("["+numbers[i]+","+numbers[numbers.length-i-1]+"]");
        }

    }
}
