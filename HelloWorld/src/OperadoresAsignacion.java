public class OperadoresAsignacion {
    public static void main(String[] args) {

        // Operador básico de asignación
        int i = 5;
        int j = i + 4;
        System.out.println("Valores iniciales:");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("Aplicando operadores: ");
        // Operadores de incrementos
        i = i + 2; // = i += 2
        System.out.println("i = " + i);
        i += 5;
        System.out.println("i = " + i);
        j-=4;
        System.out.println("j = " + j);
        j*=3;
        System.out.println("j = " + j);

        // Aplicando operadores en String
        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombre = 'Andres'";
        sqlString += " and c.activo = 1;";
        System.out.println("sqlString = " + sqlString);
        
    }
}
