package org.aguzman.ejemplos.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploIterarCollection {
    public static void main(String[] args) {

        Set<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(4);
        numbers.add(2);

        System.out.println("TreeSet numbers = " + numbers);


        System.out.println("Iterando utilizando foreach: ");
        // Iterar sobre un TreeSet
        for (Integer number : numbers){
            System.out.println(number);
        }

        // Iterando con objeto Iterator
        System.out.println("Iterando con Iterator: ");
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()){
            Integer number = it.next();
            System.out.println(number);
        }

        //Iterando con Funcion Lambda
        System.out.println("Iterando con expresiones Lambda: ");
        numbers.forEach(System.out::println);

    }
}
