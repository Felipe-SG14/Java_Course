
public class PrimitivosCaracteres {
    public static void main(String[] args) {
        // Solo un caracter de una cadena
        // Se declara con comillas simples
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal==caracter));
        
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        
        //Clase caracter
        System.out.println("Character.BYTES = " + Character.BYTES);
        System.out.println("Character.SIZE = " + Character.SIZE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);
        
        //Caracteres especiales
        //Espacio
        char espacio = '\u0020';
        System.out.println("espacio = " + espacio);
        //Retroceso
        char retroceso = '\b';
        System.out.println("Quitando el numero: 2" + retroceso);
        //Tabulador
        char tabulador = '\t';
        System.out.println("Usando " + tabulador + "Tabulador");
        //Nueva linea
        char salto = '\n';
        System.out.println("Primera linea " + salto + "Segunda Linea");
        //Retorno carro
        char r = '\r';
        System.out.println("Primera linea " + r + "Segunda Linea");

        //
        System.out.println(System.getProperty("line.separator"));

    }
}
