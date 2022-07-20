package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class EjemploLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

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

        // Añadiendo al principio de la lista
        list.addFirst(20);
        System.out.println("Añadiendo un 20 al principio de la lista: " + list);

        // Añadiendo al final de la lista
        list.addLast((30));
        System.out.println("Añadiendo un 30 al final de lista: " + list);
        
        // Obteniendo elementos
        System.out.println("list.getFirst() = " + list.getFirst());
        System.out.println("list.getLast() = " + list.getLast());
        System.out.println("list.get(2) = " + list.get(2));
        System.out.println("list = " + list);

        // Eliminando elementos
        list.removeFirst();
        list.removeLast();

        System.out.println("Lista con los elementos de los extremos removidos: " + list);



    }
}
