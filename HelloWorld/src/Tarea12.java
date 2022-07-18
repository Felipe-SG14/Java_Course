import java.util.Scanner;

public class Tarea12 {
    public static void main(String[] args) {

        //Input Data
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame el area del circulo: ");
        double radio = scanner.nextDouble();
        double area  = Math.PI * Math.pow(radio,2);
        System.out.println("El area del circulo es: " + area);
    }
}
