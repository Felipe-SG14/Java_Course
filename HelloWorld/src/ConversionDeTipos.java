public class ConversionDeTipos {
    public static void main(String[] args) {
        
        //Variable de tipo string
        String numeroStr = "50";

        //Conversion str - int
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        //Conversion str - float
        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);
        
        //Conversión str - boolean
        String logicoStr = "true"; //Admite diferentes opciones : "yes", "no", "t", "TRUE","T",etc.
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        //Conversion var - otro Admite tipos flexibles
        var logicoStr2 = "true"; //Admite diferentes opciones : "yes", "no", "t", "TRUE","T",etc.
        boolean logicoBoolean2 = Boolean.parseBoolean(logicoStr2);
        System.out.println("logicoBoolean2 = " + logicoBoolean2);

        System.out.println("Conversion de primitivos a String");
        
        // Conversion de Int a String utilizando clase Integer 
        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        // Conversion de Int a String utilizando clase String
        int otroNumeroInt2 = 50;
        System.out.println("otroNumeroInt2 = " + otroNumeroInt2);
        String otroNumeroStr2 = String.valueOf(otroNumeroInt2);
        System.out.println("otroNumeroStr2 = " + otroNumeroStr2);
        
        // Conversion de Real a String
        // Utilizando clase Double
        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);
        String otroRealStr2 = String.valueOf(1.23456f);
        System.out.println("otroRealStr2 = " + otroRealStr2);

        //Conversion de primitivos
        System.out.println("Conversion entre primitivos");
        int i = 22768;
        //Cast a short
        short s = (short)i; // Cast forzar la conversion
        System.out.println("s = " + s);
        //Cast a long
        long l = i;
        System.out.println("l = " + l);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        //Cast a char
        char c = (char) i;
        System.out.println("c = " + c);
        //Cast a float
        float f = (float) i;
        System.out.println("f = " + f);
        
    }
}
