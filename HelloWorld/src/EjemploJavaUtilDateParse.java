import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {

    public static void main(String[] args) {

        // Seleccionar un formato
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date fecha = format.parse("2020-01-14");
            System.out.println("fecha = " + fecha);
            System.out.println("fecha con formato = " + format.format(fecha));


            // Comparando fechas
            Date fecha2 = new Date();

            System.out.println("fecha = " + fecha);
            System.out.println("fecha2 = " + fecha2);
            if (fecha.after(fecha2)){
                System.out.println("Fecha del usuario es despues que fecha2");
            } else if (fecha.before(fecha2)){
                System.out.println("Fecha es anterior a fecha dos");
            } else if (fecha.equals(fecha2)) {
                System.out.println("Las fechas son iguales");
            }

            if (fecha.compareTo(fecha2) > 0){
                System.out.println("Fecha es despues que fecha2");
            } else if (fecha.compareTo(fecha2) < 0 ){
                System.out.println("Fecha es anterior a fecha2");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("Las fechas son iguales");
            }


        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
