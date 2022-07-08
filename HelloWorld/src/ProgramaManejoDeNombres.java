import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        //Scanner
        Scanner scanner = new Scanner(System.in);
        
        //Pidiendo datos 
        System.out.print("El nombre del primer familiar: ");
        String nombreUno = scanner.nextLine();
        System.out.print("El nombre del segundo familiar: ");
        String nombreSegundo = scanner.nextLine();
        System.out.print("El nombre del tercer familiar: ");
        String tercer = scanner.nextLine();
        
        //Convirtiendo Strings
        String unoAux   =  nombreUno.toUpperCase();
        String unoNuevo =  unoAux.charAt(1) + "." + nombreUno.substring(nombreUno.length()-2) ;
        String dosAux   =  nombreSegundo.toUpperCase();
        String dosNuevo =  dosAux.charAt(1) + "." + nombreSegundo.substring(nombreSegundo.length()-2) ;
        String tresAux   =  tercer.toUpperCase();
        String tresNuevo =  tresAux.charAt(1) + "." + tercer.substring(tercer.length()-2) ;
        System.out.println("Resultado: "+unoNuevo +"_"+dosNuevo+"_"+tresNuevo);
    }
}
