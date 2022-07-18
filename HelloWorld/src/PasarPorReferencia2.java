// Creado una clase
class Persona{

    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {

        // Toda variable primitiva se pasar por valor
        // En el método main se mantiene intacto el valor
        Persona persona = new Persona();
        persona.modificarNombre("Andres");
        System.out.println("persona = " + persona.getNombre());
        System.out.println("Antes de llamar al metodo test");
        test(persona);
        System.out.println("Despues de llamar al metodo test");
        System.out.println("persona = " + persona.getNombre());
        System.out.println("Termina el metodo main");
    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el método test");
        persona.modificarNombre("Pepe");
        System.out.println("Finaliza el método test");
    }
}
