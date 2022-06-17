import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;
import java.util.Locale;

// La clase principal tiene el mismo nombre del archivo
// Utilizar sintaxis Camel Case
public class HolaMundo {
    // Método main
    // public -> Se instancia el cualquier lugar
    // void -> Valor del retorno
    // Shortcut -> main + tab
    public static void main(String[] args) {
        // Definicion de variables
        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
        
        //Datos primitivos -> No tiene métodos
        int numero = 10;
        System.out.println("numero = " + numero);
        boolean valor = true;
        if (valor){
            System.out.println("valor = " + valor);
        }

        //Tipo de dato flexible
        var numero3 = "15";
    }
}
