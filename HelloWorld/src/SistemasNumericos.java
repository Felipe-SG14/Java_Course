public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);
        
        //Decimal a binario
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
        System.out.println("numeroHex = " + numeroHex);
    }
}
