public class PrimitivosEnteros {
    public static void main(String[] args) {

        //Tipo Byte
        byte numeroByte = 7;
        System.out.println("Dato tipo byte:");
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Byte.BYTES = " + Byte.BYTES);
        System.out.println("Byte.BYTES = " + Byte.SIZE);
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);

        //Tipo short
        short numeroShort = 30000;
        System.out.println("\nDato tipo short");
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Short.BYTES = " + Short.BYTES);
        System.out.println("Short.SIZE = " + Short.SIZE);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);

        //Tipo int
        int numeroInt = 36;
        System.out.println("\nDato tipo int:");
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Integer.BYTES = " + Integer.BYTES);
        System.out.println("Integer.SIZE = " + Integer.SIZE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        //Tipo long
        long numeroLong = 2147483648L;
        System.out.println("\nDato tipo long:");
        System.out.println("numeroInt = " + numeroLong);
        System.out.println("Long.BYTES = " + Long.BYTES);
        System.out.println("Long.SIZE = " + Long.SIZE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);

        //Tipo var
        //Siempre es entero hasta que pasemos el límite
        var numeroVar = 25613;
    }
}
