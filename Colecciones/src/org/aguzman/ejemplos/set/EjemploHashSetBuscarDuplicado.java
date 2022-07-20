package org.aguzman.ejemplos.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {

        // Declaración de arrelo
        String[] peces = {"Lenguado","Pejerrey","Robalo","Corvina","Atun","Lenguado"};

        // Declaracion del HashSet
        Set<String> unicos = new HashSet<>();
        Set<String> repetidos = new HashSet<>();

        for(String pez : peces){
            //Tratando de insertar valores
            if (!unicos.add(pez)){
                repetidos.add(pez);
            }
        }

        // Se limpia de los unicos, los duplicados
        unicos.removeAll(repetidos);

        // Se observa el HashSet
        System.out.println("Arreglo original: " + Arrays.toString(peces));
        System.out.println("Peces unicos: " + unicos);
        System.out.println("Peces repetidos: " + repetidos);

    }
}
