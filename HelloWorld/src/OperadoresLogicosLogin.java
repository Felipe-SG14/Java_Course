import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        // Datos de ingreso
        String username = "andres";
        String password = "123456";

        String username2 = "admin";
        String password2 = "123456";

        Scanner scanner = new Scanner(System.in);

        // Captura de datos
        System.out.print("Ingrese el username: ");
        String u = scanner.nextLine();
        System.out.print("Ingrese el password: ");
        String p = scanner.nextLine();

        // Autenticación
        boolean esAutenticado = false;
        if( (username.equals(u) && password.equals(p)) || (username2.equals(u) && password2.equals(p)) ){
            esAutenticado = true;
        } else {
            System.out.println("Username o contraseña incorrectos");
        }

        if(esAutenticado){
            System.out.println("Bienvenido usuario " + u);
        }else {
            System.out.println("Lo siento, requiere autenticación");
        }
    }
}
