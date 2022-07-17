import java.util.Scanner;

public class Tarea8 {
    public static void main(String[] args){

        // Clase Scanner
        Scanner scanner = new Scanner(System.in);

        // Pidiendo notas
        System.out.println("Ingrese las 20 notas de los los alumnos en una escala de 1 a 7");

        // Contadores
        int notasMayores5 = 0;
        int notasMayores5Size = 0;

        int notasMenores4 = 0;
        int notasMenores4Size = 0;

        int notas1 = 0;

        // Main check
        boolean working = true;

        mainLoop:
        for (int i = 1; i <= 20; i++) {
            boolean esCorrecto = false;
            do {
                System.out.print("Ingresa la nota " + i + ": ");
                double nota = scanner.nextDouble();
                //Check note
                if (nota == 0){
                    working = false;
                    break mainLoop;
                } else if (nota <= 4){
                    notasMenores4+= nota;
                    notasMenores4Size++;
                    if (nota == 1){
                        notas1++;
                    }
                    esCorrecto = true;
                } else if (nota >= 5 && nota <= 7){
                    notasMayores5+=nota;
                    notasMayores5Size++;
                    esCorrecto = true;
                } else {
                    System.out.println("La nota no entra en el rango correcto");
                }
            } while (!esCorrecto);
        }

        if (working){
            if (notasMayores5Size != 0){
                System.out.println("El promedio de notas mayores a 5 es: " + (double)notasMayores5/notasMayores5Size);
            } else {
                System.out.println("No hay notas mayores a 5!");
            }
            if (notasMenores4Size != 0) {
                System.out.println("El promedio de notas inferiores a 4 es: " + (double)notasMenores4/notasMenores4Size);
            } else {
                System.out.println("No hay notas inferiores a 4!");
            }
            System.out.println("La cantidad de notas iguales a 1 es: " + notas1);
            System.out.println("El promedio total es: " + (double)(notasMenores4 + notasMayores5)/20);
        }
    }
}
