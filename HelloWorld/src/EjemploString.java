public class EjemploString {
    public static void main(String[] args) {
        // Creación del objeto string 
        String  curso   = "Programación en Java";
        String  curso2  = new String("Programación en Java");
        
        // Comparando por referencia
        System.out.println("Comparando por referencia: ");
        System.out.println("curso == curso2 = " + curso==curso2);
        
        // Comparando por contenido
        System.out.println("Comparando por valor: ");
        System.out.println("curso.equals(curso2) = " + curso.equals(curso2));
        
        // Comparando ignorando mayúsculas y minúsculas
        String curso3  = "programación en java";
        System.out.println("Comparando ignorado el case:");
        System.out.println("curso3.equalsIgnoreCase(curso) = " + curso3.equalsIgnoreCase(curso));


        
    }
}
