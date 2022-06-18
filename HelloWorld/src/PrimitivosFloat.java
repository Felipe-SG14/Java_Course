
public class PrimitivosFloat {
    public static void main(String[] args) {
        //Tipo de dato float
        //Acepta notación científica
        float realFloat = 2.12e-3f; //2120f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("Float corresponde en byte a = " + Float.BYTES);
        System.out.println("Float corresponde en bites a  = " + Float.SIZE);
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);
        System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE);

        //Tipo de dato double
        double realDouble = 3.4828e3;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Double corresponde en byte a = " + Double.BYTES);
        System.out.println("Double corresponde en bites a  = " + Double.SIZE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);

        //var flotante
        var varFlotante = 3.1416;
        System.out.println("varFlotante = " + varFlotante);
    }
}
