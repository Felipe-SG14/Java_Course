import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        //calendar.set(1999,2,14,0,0,0);
        calendar.set(Calendar.YEAR, 2050);
        calendar.set(Calendar.MONTH,Calendar.JULY);
        calendar.set(Calendar.DAY_OF_MONTH,25);

        //calendar.set(Calendar.HOUR_OF_DAY,21);
        calendar.set(Calendar.HOUR,7);
        calendar.set(Calendar.AM_PM,Calendar.AM);
        calendar.set(Calendar.MINUTE, 20);
        calendar.set(Calendar.SECOND,10);
        calendar.set(Calendar.MILLISECOND, 125);

        Date fecha = calendar.getTime();
        System.out.println("Fecha sin formato");
        System.out.println("calendar = " + fecha);

        // Fecha con formato
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
        String fechaFormat = sdf.format(fecha);
        System.out.println("Fecha con formato");
        System.out.println("fechaFormat = " + fechaFormat);
    }
}
