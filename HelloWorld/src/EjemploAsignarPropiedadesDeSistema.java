import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            // Leer archivo
            FileInputStream archivo = new FileInputStream("src/config.properties");

            // Se carga el archivo properties
            Properties p = new Properties(System.getProperties());
            p.load(archivo);

            //Se puede acceder a una propiedad o adicionar una nueva
            System.out.println(p.getProperty("otra"));
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado");

            //Se añaden esas propiedades al sistema
            System.setProperties(p);
            //System.getProperties().list(System.out); --> Listar propiedades

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
