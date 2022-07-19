package org.aguzman.ejemplos.set;

import java.util.*;

public class EjemploHashSetAgregar {

    public static void main(String[] args) {

        // Creación del HashSet
        Set<String> hs = new HashSet<>();
        
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");

        System.out.println("hs = " + hs);

        boolean b = hs.add("tres");
        System.out.println("permite elementos duplicados = " + b);
        System.out.println("hs = " + hs);
        
        // Obteniendo el tamaño de el hashSet
        System.out.println("hs.size() = " + hs.size());

        // Pasando de HashSet a ArrayList
        List<String> list = new ArrayList<>(hs);
        System.out.println("El hashSet ahora es una lista: ");
        System.out.println("list = " + list);

        // Ordenando lista
        Collections.sort(list);
        System.out.println("list ordenada= " + list);
        
    }
}
