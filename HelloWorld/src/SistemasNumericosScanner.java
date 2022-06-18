import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {
        //Se crea la clase Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero entero: ");
        int numeroDecimal = 0;

        try {
            numeroDecimal = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Error: " + e.toString());
            main(args);
            System.exit(0);
        }

        //Conversión
        String mensajeBinario = "Numero binario de: " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String mensajeOctal = "\nNumero octal de: " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String mensajeHex = "\nNumero hexadecimal de: " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        String mensaje = mensajeBinario + mensajeOctal + mensajeHex;
        System.out.println(mensaje);

    }
}
