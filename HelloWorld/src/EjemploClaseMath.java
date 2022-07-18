public class EjemploClaseMath {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        double numero = Math.ceil(2.9);
        System.out.println("numero = " + numero);

        double numero2 = Math.floor(3.5);
        System.out.println("numero2 = " + numero2);
        
        double max = Math.max(3.5,1.2);
        System.out.println("max = " + max);
        
        double min = Math.min(1.2,8);
        System.out.println("min = " + min);
        
        double round = Math.round(2.6);
        System.out.println("round = " + round);

        System.out.println("Math.PI = " + Math.PI);
        System.out.println("Math.E = " + Math.E);
        
        // Funcion exponencial
        double exp = Math.exp(1);
        System.out.println("exp = " + exp);
        
        // Logaritmo natural
        double log = Math.log(10);
        System.out.println("log = " + log);
        
        // Potencia
        double potencia = Math.pow(10,3);
        System.out.println("potencia = " + potencia);
        
        // Raiz cuadrada
        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);
        
        // Convertir de grados a radianes
        double grados = Math.toDegrees(1.57);
        System.out.println("grados = " + grados);
        
        // Convertir a radianes
        double radianes = Math.toRadians(360);
        System.out.println("radianes = " + radianes);

        // Sin
        System.out.println("Math.sin(90) = " + Math.sin(Math.toRadians(90)));

        // Cos
        System.out.println("Math.cos(Math.toRadians(90)) = " + Math.cos(Math.toRadians(90)));
    }
}
