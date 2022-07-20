package org.aguzman.ejemplos.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EjemploListComparableComparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(2);

        System.out.println("Lista con el orden en el que se inserta: " + list);

        // Ordenando con Collections
        Collections.sort(list);
        Collections.sort(list,Comparator.reverseOrder());
        // Ordenando atraves de la lista


        System.out.println("Lista ordenada: " + list);


    }
}
