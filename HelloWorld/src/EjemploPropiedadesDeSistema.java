import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {

        // Obtener el username
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        // Obtener la direccion del home
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        // Obtener la direccion del actual workspace
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        // Obtener la version de java
        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        // Separador de linea
        String lineSeparator   = System.getProperty("line.separator");
        String lineSeparator2  = System.lineSeparator();
        System.out.println("lineSeparator + \"Una linea nueva\" = " + lineSeparator + "Una linea nueva");

        // Para listar propiedades
        Properties p = System.getProperties();
        p.list(System.out);
    }
}
