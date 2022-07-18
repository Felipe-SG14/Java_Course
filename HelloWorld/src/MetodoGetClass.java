import java.lang.reflect.Method;

public class MetodoGetClass {
    public static void main(String[] args) {
        String texto = "Hola que tal";

        // Re-descubrir por completo la clase y regresar informacion
        Class strClass = texto.getClass();

        // Nombre completo de la clase
        System.out.println("strClass.getName() = " + strClass.getName());

        // Solo obtener el Nombre sin incluir el paquete
        System.out.println("strClass = " + strClass.getSimpleName());

        // Nombre del paquete
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());

        //
        System.out.println("strClass = " + strClass);

        // Metodos de la clase
        for (Method metodo : strClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }

        // Clase Integer;
        Integer num = 34;
        System.out.println("\n==================\nClase Integer");
        Class intClass = num.getClass();
        System.out.println("intClass = " + intClass);
        System.out.println("intClass.getName() = " + intClass.getName());
        System.out.println("intClass.getSimpleName() = " + intClass.getSimpleName());
        // Obtener super clase
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass());
        for (Method metodo : intClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }

    }
}
