package map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class EjemploTreeMap {
    public static void main(String[] args) {

        // Definición del TreeMap
        Map<String,Integer> map = new TreeMap<>(Comparator.reverseOrder());

        // Insertando valores
        map.put("uno",1);
        map.put("dos",2);
        map.put("tres",3);
        map.put("cuatro",4);

        System.out.println("map = " + map);

    }
}
