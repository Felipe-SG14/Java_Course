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
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
