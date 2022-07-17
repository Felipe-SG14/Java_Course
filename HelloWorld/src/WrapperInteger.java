public class WrapperInteger {
    public static void main(String[] args) {


        int intPrimitivo = 32768;

        // Boxing
        Integer intObjeto = Integer.valueOf(intPrimitivo);

        // AutoBoxing
        Integer intObjeto2 = intPrimitivo;
        System.out.println("intObjeto = " + intObjeto);

        // Convertir de Integer a int
        int num = intObjeto;
        System.out.println("num = " + num);
        int num2  = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        // String
        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        // Se puede convertir pero se pierde información
        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);
        
        // Byte
        Byte byteObjecto = intObjeto.byteValue();
        System.out.println("byteObjecto = " + byteObjecto);
        
        // Long
        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);
    }
}
