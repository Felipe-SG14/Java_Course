import java.util.Scanner;

public class Tarea9 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        //Pedir números
        System.out.print("Dame el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Dame el segundo numero: ");
        int num2 = scanner.nextInt();

        int resultado = 0;

        // Ambos negativos
        if ( (num1 < 0 && num2 < 0) || (num1 > 0 && num2 > 0) ){
            for (int i = 0; i < Math.abs(num1); i++) {
                resultado += Math.abs(num2);
            }
        } else {
            for (int i = 0; i < Math.abs(num1); i++) {
                resultado += Math.abs(num2);
            }
            resultado*=-1;
        }

        System.out.println("El resultado es: " + resultado);

    }
}
