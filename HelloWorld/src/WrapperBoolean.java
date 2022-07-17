public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;

        num1 = 1;
        num2 = 2;

        // Boolean primitivo
        boolean primBoolean = num1 > num2; // False

        // Boolean de referencia ( AutoBoxing )
        Boolean objBoolean  = false;
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = Boolean.valueOf(false);

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        // Comparando dos objetos Boolean ( por la instancia )
        // Boolean sin importar si es objeto o primitivo se puede comparar con ==
        // o tambien con equals
        System.out.println("comparando dos objetos boolean: " + (objBoolean==objBoolean2) );
        System.out.println("comparando dos objetos boolean: " + (objBoolean.equals(objBoolean2)) );

        // Pasar de objeto a primitivo
        boolean prim = objBoolean.booleanValue();

    }
}
