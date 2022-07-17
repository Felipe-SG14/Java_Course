public class AutoBoxingInteger {
    public static void main(String[] args) {
        Integer[] enteros = {1,2,3,4,5,6,7,8,10,11,12,13,14,15};

        // Forma Explicita
        int suma = 0;
        for (Integer entero: enteros) {
            if ( entero.intValue() %2 == 0 ) {
                suma += entero;
            }
        }
        System.out.println("suma = " + suma);

        // AutoBoxing
        suma = 0;
        for (Integer entero: enteros) {
            if ( entero%2 == 0 ) {
                suma += entero;
            }
        }
        System.out.println("suma = " + suma);
    }
}
