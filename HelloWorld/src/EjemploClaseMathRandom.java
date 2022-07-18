public class EjemploClaseMathRandom {
    public static void main(String[] args) {
        
        String[] colores = {"azul","amarillo","rojo","verde","blanco"};
        double random = Math.random(); // Numero aleatorio entre 0 y 1
        System.out.println("random = " + random);
        
        random *= colores.length;
        System.out.println("random = " + random);
        
        random = Math.floor(random);
        System.out.println("random = " + random);
        System.out.println("colores[(int) random] = " + colores[(int) random]);
                
    }
}
