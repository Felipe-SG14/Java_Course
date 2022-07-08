import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {
        
        // Operadores aritméticos
        int i = 5,j = 4;
        
        // Operador suma y prioridades
        int suma = i + j;
        System.out.println("suma = " + suma);
        System.out.println("i + j = " + i + j);
        System.out.println("(i + j) = " + (i + j)); // Correcta
        
        // Operador resta
        int resta = i-j;
        System.out.println("resta = " + resta);
        System.out.println("(i - j) = " + (i - j));
        
        // Operador multiplicación
        int multiplicacion = i*j;
        System.out.println("multiplicacion = " + multiplicacion);
        
        // Operador de division
        int division = i/j;
        float div2   = (float)i/j;
        System.out.println("division = " + division);
        System.out.println("div2 = " + div2);
        
        // Operador módulo
        int resto = i%j;
        System.out.println("resto = " + resto);
        System.out.println("(8%5) = " + (8%5));

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        if (numero%2 == 0){
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar");
        }
    }
}
