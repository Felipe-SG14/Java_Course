package org.aguzman.ejemplos.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        
        // Agregar elementos
        list.add(1);
        list.add(3);
        list.add(2);
        
        // Obtener tamaño
        System.out.println("list.size() = " + list.size());
        
        // Verificar si esta vacia la lista
        System.out.println("list.isEmpty() = " + list.isEmpty());

        // Insertando en indice especifico
        System.out.println("Lista original: " + list);
        list.add(1,10);
        System.out.println("Lista insertando un en 10 en la posicion 1: " + list);

        // Removiendo un elemento de una lista
        list.remove(1);
        System.out.println("Lista con el elemento del indice 1 eliminado: " + list);

        // Verificando si existe un uno en la lista
        System.out.println("list.contains(1) = " + list.contains(1));

        //Pasando a arrelgo
        int[] listArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            listArray[i] = list.get(i);
        }

        // Imprimiendo la lista como arreglo
        System.out.println("Lista como arreglo: " + Arrays.toString(listArray));

    }
}
