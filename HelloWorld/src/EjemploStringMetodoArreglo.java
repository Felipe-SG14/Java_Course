public class EjemploStringMetodoArreglo {
    public static void main(String[] args) {
        
        String trabaLenguas = "trabaLenguas";

        // Pasando a charArray
        System.out.println("trabaLenguas.toCharArray() = " + trabaLenguas.toCharArray());
        char[] arreglo = trabaLenguas.toCharArray();
        System.out.println("arreglo.length = " + arreglo.length);

        //Recorriendo el array
        for (int i=0;i< arreglo.length;i++){
            System.out.print(arreglo[i]);
        }

        // Utilizando el método split
        System.out.println("trabaLenguas = " + trabaLenguas.split("a"));
        String[] arreglo2 = trabaLenguas.split("a");
        for (int i = 0 ; i < arreglo2.length; i++){
            System.out.println(arreglo2[i]);
        }

        String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split("[.]"); // Se puede marcar buscando corchetes o doble slash
        for(int i = 0; i< archivoArr.length;i++){
            System.out.println(archivoArr[i]);
        }

        System.out.println("Extension = " + archivoArr[archivoArr.length-1]);


    }
}
