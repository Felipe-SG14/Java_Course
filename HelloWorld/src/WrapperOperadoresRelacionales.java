public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        
        Integer num  = 1000;
        Integer num2 = num;

        // Apuntan al mismo objeto por lo que son lo mismo
        // Compara por instancia
        System.out.println("num2 = " + num2);
        System.out.println("num2 = " + num2);
        System.out.println("Son el mismo objeto? " + (num == num2));

        // Java compara con AutoBoxing automaticamente hasta el 127
        num2 = 1000;

        // num2 es otro objeto por lo que no son lo mismo
        System.out.println("num2 = " + num2);
        System.out.println("num2 = " + num2);
        System.out.println("Son el mismo objeto? " + (num == num2));

        // Para comparar por valor con Objetos es con el método equals
        System.out.println("Tienen el mismo valor? " + (num.equals(num2)));

        // Convirtiendo a primitivo y comparando
        System.out.println("Tienen el mismo valor? " + (num.intValue() == num2.intValue()));


        // Operadores logicos
        // Se puede usar tanto en referencia como valor
        num = 2000;
        boolean condicion = num > num2;
        System.out.println("condicion = " + condicion);

        condicion = num.intValue() > num2.intValue();
        System.out.println("condicion = " + condicion);

    }
}
