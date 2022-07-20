package org.aguzman.ejemplos.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        // Tienen un costo de rendimiento porque son ordenados
        Set<String> ts = new TreeSet<>();
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");

        System.out.println("El TreeSet");
        System.out.println("ts = " + ts);

        // TreeSet de enteros
        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());
        numeros.add(1);
        numeros.add(5);
        numeros.add(4);
        numeros.add(2);
        numeros.add(3);
        numeros.add(5);
        numeros.add(10);

        System.out.println("TreeSet de numeros: ");
        System.out.println("numeros = " + numeros);


    }
}
