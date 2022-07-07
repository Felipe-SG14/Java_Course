public class EjemploStringValidar {
    public static void main(String[] args) {
        
        String curso = null;
        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if (curso == null){
            curso = "Programación Java";
        }
        
        // Método para obtener longitud de una cadena
        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);
        // Método para saber si un string no tiene contenido
        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);
        // Método para saber si un string esta lleno de espacios
        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);
        if (curso.isEmpty() == false && curso.isBlank() == false){
            System.out.println(curso.toUpperCase());
            // Un string nulo no puede ser concatenado ni concatenarle nada
            System.out.println("Bienvenido al curso " + curso);
        }

    }
}
