public class OperadoresIncrementales {
    public static void main(String[] args) {
        
        int i = 1;

        // Pre-incremento
        int j = ++i;
        System.out.println("Pre-Incremento");
        System.out.println("j = " + j);

        // Post-incremento
        i = 2;
        j= i++;
        System.out.println("Post-Incremento");
        System.out.println("j = " + j);
        System.out.println("i = " + i);


        // Pre-Decremento
        i=3;
        System.out.println("Pre-Decremento");
        System.out.println("i = " + i);
        j=--i;
        System.out.println("j = " + j);

        // Post-Decremento
        i = 4;
        j = i--;
        System.out.println("Pre-Decremento");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("j++ = " + (j++));
        System.out.println("++j = " + (++j));
    }
}
