public class OperadoresUnarios {
    public static void main(String[] args) {
        // Operador negativo 
        int i = -5;
        System.out.println("i = " + i);
        
        // Operador positivo
        int j = +5;
        System.out.println("j = " + j);
        
        int k = -i;
        System.out.println("k = " + k);
        
        i = 6;
        j = +i;
        System.out.println("k = " + k);

        k= -i;
        System.out.println("k = " + k);
    }
}
