import javax.swing.*;

public class Tarea6 {
    public static void main(String[] args) {

        // Pidiendo nombre
        String nombre1 = JOptionPane.showInputDialog(null,"Dame el primer nombre:");
        String nombre2 = JOptionPane.showInputDialog(null,"Dame el segundo nombre:");
        String nombre3 = JOptionPane.showInputDialog(null,"Dame el tercer nombre:");

        //Analisis de los nombres
        String[] uno  = nombre1.split(" ");
        String[] dos  = nombre2.split(" ");
        String[] tres = nombre3.split(" ");

        //Tamaños
        int lenUno  = uno[0].length();
        int lenDos  = dos[0].length();
        int lenTres = tres[0].length();

        int max = (lenUno>lenDos) ? lenUno:lenDos;
        max = (max>lenTres) ? max : lenTres;

        if (max == lenUno){
            JOptionPane.showMessageDialog(null,nombre1 + " tiene el nombre mas largo");
        } else if (max == lenDos) {
            JOptionPane.showMessageDialog(null,nombre2 + " tiene el nombre mas largo");
        } else if (max == lenTres) {
            JOptionPane.showMessageDialog(null,nombre3 + " tiene el nombre mas largo");
        }
    }
}
