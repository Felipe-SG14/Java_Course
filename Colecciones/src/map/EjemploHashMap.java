package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();

        // Llaves son unicas
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        map.put("4",4);

        System.out.println("map.get(\"1\") = " + map.get("1"));
        System.out.println("map = " + map);
        System.out.println("map.toString() = " + map.toString());

        // Removiendo por llave
        map.remove("2");
        System.out.println("map con valor de llave=\"2\" removido = " + map);
        map.remove("3",3);
        System.out.println("Eliminando con comb combinacion de llave y valor = " + map);
        
        // Metodo contains
        System.out.println("map.containsKey(\"2\") = " + map.containsKey("2"));
        System.out.println("map.containsKey(\"1\") = " + map.containsKey("1"));
        System.out.println("map.containsValue(1) = " + map.containsValue(1));
        System.out.println("map.containsValue(2) = " + map.containsValue(2));

        // Pasando a coleccion
        Collection<Integer> collections = map.values();
        System.out.println("collections = " + collections);
        
        // Keys
        Set<String> llaves = map.keySet();
        System.out.println("llaves = " + llaves);
        
    }
}
