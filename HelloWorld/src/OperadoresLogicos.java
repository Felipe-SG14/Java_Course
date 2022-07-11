public class OperadoresLogicos {
    public static void main(String[] args) {
        
        int i = 3;
        byte j = 3;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;
        
        // Operador Lógico AND
        boolean b1 = i==j && k<l && m == false;
        System.out.println("b1 = " + b1);
        
        // Operador Lógico OR
        boolean b2 = i == j || k < l;
        System.out.println("b2 = " + b2);

        // Combinación de operadores
        // Se evalúan de izquierda a derecha
        boolean b3 = i==j && (k<l || m == true);
        System.out.println("b3 = " + b3);

        // El operador AND tiene mayor prioridad
        boolean b4 = (i==j || k<l) && m == true;
        System.out.println("b4 = " + b4);
        
        boolean b5 = (true || true) && false;
        System.out.println("b5 = " + b5);

        // Primero se evalúa el AND y luego la regla de izqquierda a derecha
        boolean b6 = true || false && false || false;
        System.out.println("b6 = " + b6);
        
        boolean b7 = ((true || false) && false) || false;
        System.out.println("b7 = " + b7);
    }
}
