public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        // Concatenación de String
        String a = "a";
        String b = "b";
        String c = a;
        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i<100 ; i++){
            // Utilizando el método concat -> 2 - 4 ms
            // c = c.concat(a).concat(b).concat("\n");
            // Utilizando concatenación con operador + -> 19 - 21 ms
            // c+=a+b+"\n";
            // Utilizando String Builder -> 0 - 1 ms
            sb.append(a).append(b).append("\n");

            // El método más eficiente es StringBuilder
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        //System.out.println("c = " + c);
    }
}
