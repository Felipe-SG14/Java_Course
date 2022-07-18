import java.util.Random;

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

        // Random con Java Util
        Random random1 = new Random();
        // Entero aleatorio
        int randomInt = random1.nextInt();
        System.out.println("randomInt = " + randomInt);

        // Aleatorio entre 0 y 7, 7 no se incluye
        // Valores entre 15 y 24
        int randomIntP = 15 + random1.nextInt(25 - 15);
        System.out.println("randomIntP = " + randomIntP);
        
        int randomArr = random1.nextInt(colores.length);
        System.out.println("colores[randomArr] = " + colores[randomArr]);
    }
}
