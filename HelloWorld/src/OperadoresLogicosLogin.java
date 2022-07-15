import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        // Datos de ingreso
        /*String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames[0] = "andres";
        passwords[0] = "123456";

        usernames[1] = "admin";
        passwords[1] = "123456";

        usernames[2] = "pepe";
        passwords[2] = "123456";
         */

        // Definiendo arreglo
        String[] usernames = {"andres","admin","pepe"};
        String[] passwords = {"123456","123456","123456"};

        Scanner scanner = new Scanner(System.in);

        // Captura de datos
        System.out.print("Ingrese el username: ");
        String u = scanner.nextLine();
        System.out.print("Ingrese el password: ");
        String p = scanner.nextLine();

        // Autenticación
        boolean esAutenticado = false;
        for (int i = 0; i < usernames.length ; i++) {
            if (usernames[i].equals(u) && passwords[i].equals(p)) {
                esAutenticado = true;
                break;
            }
        }

        if(esAutenticado){
            System.out.println("Bienvenido usuario " + u);
        }else {
            System.out.println("Lo siento, requiere autenticación");
            System.out.println("Username o contraseña incorrecta");
        }
    }
}
