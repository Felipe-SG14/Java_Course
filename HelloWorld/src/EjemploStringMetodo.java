import java.util.Locale;

public class EjemploStringMetodo {
    public static void main(String[] args) {
        
        String nombre = "Andres";
        // Métodos para la clase String
        System.out.println("nombre = " + nombre);
        
        // Longitud de una cadena
        System.out.println("nombre.length() = " + nombre.length());
        
        // Convertir a mayúsculas
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        
        // Convertir a minúsculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        
        // Comparar el valor del String
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres"));
        
        // Comparar el valor del string ignorando el CASE
        System.out.println("nombre.equalsIgnoreCase(\"andres\") = " + nombre.equalsIgnoreCase("andres"));

        // Compara a nivel del valor del unicode (0->iguales)
        System.out.println("nombre.compareTo(\"\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));

        // Regresa el carácter en el índice indicado
        System.out.println("nombre.charAt(0) = " + nombre.charAt(2));

        // Obtener substring
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));

        // Comando replace
        String trabaLengua = "trabaLenguas";
        System.out.println("trabaLengua.replace(\"a\",\".\") = " + trabaLengua.replace("a","."));
        System.out.println("trabaLengua = " + trabaLengua);
        
        // Método IndexOf
        System.out.println("trabaLengua.indexOf(\"a\") = " + trabaLengua.indexOf("a"));
        System.out.println("trabaLengua.lastIndexOf(\"a\") = " + trabaLengua.lastIndexOf("a"));
        System.out.println("trabaLengua.indexOf(\"z\") = " + trabaLengua.indexOf("z"));
        // Regresa -1 si no lo encuentra
        
        // Método contains Regresa un booleano mencionando si el String contiene al substring
        System.out.println("trabaLengua.contains(\"Lengua\") = " + trabaLengua.contains("Lengua"));

        // Método StartsWith -> Regresa un booleano
        System.out.println("trabaLengua.startsWith(\"tr\") = " + trabaLengua.startsWith("tr"));
        
        // Método EndsWith -> Regresa un booleano
        System.out.println("trabaLengua.endsWith(\"s\") = " + trabaLengua.endsWith("s"));
        
        // Método trim
        String stringToTrim = "  trabalenguas  ";
        System.out.println("stringToTrim = " + stringToTrim);
        System.out.println("stringToTrim.trim() = " + stringToTrim.trim());
        
    }
}
