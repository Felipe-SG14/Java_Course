public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        // Declarando desde la clase Object
        Object texto = "Creando un objeto de la clase String";
        Object num = 7;


        Number num2 = Integer.valueOf(7);

        boolean b1 = texto instanceof Integer;
        // Preguntando si la variable texto es de tipo Integer
        System.out.println("texto es del tipo Integer: " + b1);

        // Numero es de tipo integer
        b1 = num instanceof Integer;
        System.out.println("num es de tipo Integer: " + b1);
        b1 = num instanceof Long;
        System.out.println("num es del tipo Long: " + b1);
        b1 = num instanceof Double;
        System.out.println("num es del tipo double: " + b1);

        Number decimal = 51.24;
        b1 = decimal instanceof Double;
        System.out.println("decimal es del tipo Double: " + b1 );
        b1 = decimal instanceof Float;
        System.out.println("decimal es del tipo Float: " + b1);
        b1 = decimal instanceof Integer;
        System.out.println("decimal es del tipo Integer: " + b1);

    }
}
