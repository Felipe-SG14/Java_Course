import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        
        // Clase Date
        Date date = new Date();
        System.out.println("date = " + date);
        
        // Para dar formato de fecha
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE dd-MMMM-yy hh:mm:ss zzzz");
        String fechaStr = simpleDateFormat.format(date);
        System.out.println("fechaStr = " + fechaStr);
        
        // Método Get Time
        Date fechaDos = new Date();
        long j = 0;
        for(int i = 0 ; i < 1000000; i++ ){
            j += i;
        }
        long tiempoFinal = fechaDos.getTime() - date.getTime();
        System.out.println("tiempoFinal = " + tiempoFinal);
        
    }
}