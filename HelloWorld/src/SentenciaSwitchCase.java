import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int mes = 12;
        System.out.println("Ingresa el numero de mes...");
        String nombreMes = scanner.nextLine();

        switch (mes){
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Indefinido";
        }
        System.out.println("nombreMes = " + nombreMes);




        int num = 3;
        switch (num){
            case 0:
                System.out.println("El num es cero...");
                break;
            case 1:
                System.out.println("El num es uno...");
                break;
            case 2:
                System.out.println("El num es dos...");
                break;
            case 3:
                System.out.println("El num es tres...");
                break;
        }

    }
}
