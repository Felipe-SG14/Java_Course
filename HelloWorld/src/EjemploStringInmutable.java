public class EjemploStringInmutable {
    public static void main(String[] args) {
        // Los Strings son inmutables
        String curso    = "Programación en Java";
        String profesor = "Andrés Guzmán";

        String resultado = curso.concat(profesor);
        // Aplicar el método concat a curso, no modifica la variable original
        // si no crea otra instancia que puede ser guardada.
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        // Utilizando función lambda
        String resultado2 =  curso.transform((c) ->{
            return c + " con " + profesor;
        });
        System.out.println("resultado2 = " + resultado2);
        // Aplicando una función lambda, no altera la variable original
        System.out.println("curso = " + curso);

        // Utilizando función replace
        String resultado3 = resultado.replace("a","A");
        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);

        // Los resultados de métodos se deben guardar en otra variable


    }
}
