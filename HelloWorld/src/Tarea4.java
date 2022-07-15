import java.util.Scanner;

public class Tarea4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pidiendo los dos numeros
        System.out.print("Dame el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Dame el segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.println("El numero mas grande es: ");
        int maximo = (num1>num2) ? num1 : num2;
        System.out.println("maximo = " + maximo);
    }
}
