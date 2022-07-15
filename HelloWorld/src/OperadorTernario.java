import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        //tipo variable = (condicion) ? valor_verdadero : valor_falso;
        String variable  = (7==7) ? "Es verdadero": "Es falso ";
        System.out.println("variable = " + variable);
        
        
        String estado = "";
        double promedio = 6.2;

        double matematicas = 0;
        double ciencias = 0;
        double historia = 0;

        Scanner scanner =  new Scanner(System.in);

        System.out.print("Ingrese la nota de matematicas (2-7): ");
        matematicas = scanner.nextDouble();
        System.out.print("Ingrese la nota de ciencias (2-7): ");
        ciencias = scanner.nextDouble();
        System.out.print("Ingrese la nota de historia (2-7): ");
        historia = scanner.nextDouble();
        promedio = (matematicas + ciencias + historia)/3;
        System.out.println("promedio = " + promedio);
        estado = (promedio >= 5.49) ? "Aprobado" : "No aprobado";
        System.out.println("estado = " + estado);
    }
}
