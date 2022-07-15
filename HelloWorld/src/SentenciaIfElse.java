import java.util.Scanner;

public class SentenciaIfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el año a comprobar: ");
        int anio = scanner.nextInt();
        // Saber si un año es bisiesto

        if (anio%400 == 0 || ((anio%4 == 0) && !(anio % 100 == 0))){
            System.out.println("Es año bisiesto...");
        } else {
            System.out.println("No es año bisiesto...");
        }
    }
}
