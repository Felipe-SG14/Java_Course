import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog(null,"Ingrese un número entero:");
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(str);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error: " + e.toString());
            main(args); //Se ejecuta de nuevo main
            System.exit(0); //Se sale del programa
        }
        
        /*//Decimal a binario
        System.out.println("Numero binario de: " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        //Sistema octal
        System.out.println("Numero octal de: " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        //Sistema hexadecimal
        System.out.println("Numero hexadecimal de: " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);*/


        //Interfaz con JOption Pane
        String mensajeBinario = "Numero binario de: " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String mensajeOctal = "\nNumero octal de: " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String mensajeHex = "\nNumero hexadecimal de: " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        String mensaje = mensajeBinario + mensajeOctal + mensajeHex;
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
