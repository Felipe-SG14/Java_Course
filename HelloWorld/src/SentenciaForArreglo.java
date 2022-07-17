import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        // Definiendo un arreglo
        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};

        for (int i = 0; i < nombres.length; i++) {
            if ( nombres[i].equalsIgnoreCase("Andres") || nombres[i].equalsIgnoreCase("Pepa") ){
                continue;
            } else {
                System.out.println("nombres["+i+"]: " + nombres[i]);
            }
        }
        
        String buscar = JOptionPane.showInputDialog(null,"Ingresa un nombre: ");
        System.out.println("buscar = " + buscar);
        boolean encontrado = false;
        for (int i = 0; i < nombres.length; i++) {
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null,"Encontado!");
        } else {
            JOptionPane.showMessageDialog(null,"No existe!");
        }
    }
}
