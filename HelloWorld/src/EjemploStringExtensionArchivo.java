public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        
        // Curso
        String archivo = "alguna_imagen.jpg";
        System.out.println("archivo.length() = " + archivo.length());
        
        
        // Mi solución
        if (archivo.lastIndexOf('.') != -1) {
            String extension = archivo.substring(archivo.lastIndexOf(".")+1);
            System.out.println("extension = " + extension);
        } else {
            System.out.println("El archivo no tiene extensión");
        }

    }
}
