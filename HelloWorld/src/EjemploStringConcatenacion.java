public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        // Concatenación de String
        String curso    = "Programación en Java";
        String profesor = "Andrés Guzmán";
        String detalle  = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        // Concatenando Int y String
        System.out.println("\nUniendo INT y String:");
        int numeroA = 10;
        int numeroB = 5;
        // Siempre tienen mayor prioridad los paréntesis
        System.out.println(detalle + " " + (numeroA + numeroB));
        // Evaluar orden
        System.out.println(numeroA+numeroB+detalle);

        // Concatenando utilizando método
        System.out.println("\nConcatenando utilizando método: ");
        // Concat no borra la variable, los String son inmutables
        // ¡El método concat es más eficiente!
        String detalle2 = curso.concat(" con ".concat(profesor));
        System.out.println("detalle2 = " + detalle2);
    }
}
