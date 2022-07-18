import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Tarea11 {
    public static void main(String[] args) {
        
        // Input Data
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su fecha de nacimiento con el formato (dd-mm-yyyy): ");
        String fecha = scanner.nextLine();
        // Format de la fecha de nacimiento y conversión a Date
        SimpleDateFormat parseBd = new SimpleDateFormat("dd-MM-yyyy");
        Date bDay;
        try {
            bDay = parseBd.parse(fecha);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        //Now... bDay has the Date objet of the Birthday

        //Format de la fecha
        SimpleDateFormat month = new SimpleDateFormat("MM");
        SimpleDateFormat year  = new SimpleDateFormat("yyyy");
        SimpleDateFormat day   = new SimpleDateFormat("dd");
        Date actualDate = new Date();

        // Get int values
        int birthYear   = Integer.parseInt(year.format(bDay));
        int actualYear  = Integer.parseInt(year.format(actualDate));
        int birthMonth  = Integer.parseInt(month.format(bDay));
        int actualMonth = Integer.parseInt(month.format(actualDate));
        int birthDay    = Integer.parseInt(day.format(bDay));
        int actualDay   = Integer.parseInt(day.format(actualDate));

        int pivotYear = actualYear - birthYear;

        if (bDay.before(actualDate)){
            if ( birthMonth > actualMonth ){
                pivotYear-=1;
            } else if ( birthMonth == actualMonth ) {
                if ( birthDay > actualDay ){
                    pivotYear-=1;
                } else if ( birthDay == actualDay ) {
                    System.out.println("Es tu cumpleaños, esta cumpliendo: " + pivotYear);
                }
            }
            System.out.println("Tienes " + pivotYear + " años...");
        } else if (bDay.after(actualDate)) {
            System.out.println("Aun no naces...");
        } else {
            System.out.println("Estas naciendo...");
        }
    }
}
