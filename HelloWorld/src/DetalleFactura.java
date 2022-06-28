import java.util.Scanner;

/*
    La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura,
    se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:

    1.- Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.
    2.- Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).
    3.- Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%

    Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto),
    el impuesto y el monto total neto incluyendo impuesto.

    Por ejemplo, el resultado podría ser algo así:

    La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082
    y el monto después de impuesto es de 160.3882
*/
public class DetalleFactura {
    public static void main(String[] args) {
        //Scanner
        Scanner scanner = new Scanner(System.in);
        
        //Se pide el nombre de la factura:
        System.out.println("El nombre de la factura es: ");
        String nombreFactura = scanner.nextLine();

        double sumaPrecios = 0;
        //Recibiendo precios de productos
        for (int i = 0; i<2 ; i++)
        {
            System.out.println("El precio del producto "+ Integer.toString(i) + " es: ");
            sumaPrecios += scanner.nextDouble();
        }
        double impuestoTotal = sumaPrecios * 0.19;

        //Salida
        System.out.println("La factura "+ nombreFactura +" tiene un total bruto de "+ Double.toString(sumaPrecios) + ", con un impuesto de " + Double.toString(impuestoTotal) +" y el monto después de impuesto es de " + Double.toString(sumaPrecios+impuestoTotal));
        
    }
}
