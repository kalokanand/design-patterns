package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<String, Integer> results = new HashMap<>();
        results.put("Alok", 62);
        results.put("Adrika", 98);
        results.put("Sonam", 55);

        System.out.println("Printing Map using Iterator");
        Iterator iterator = results.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() +" , "+entry.getValue());
        }

        System.out.println("Printing Map using for loop");
        for(Map.Entry entry:results.entrySet()){
            System.out.println(entry.getKey() +" , "+entry.getValue());
        }
        System.out.println("Printing Map using forEach");
        results.forEach((k,V)-> System.out.println(k+" , "+V));
    }
}
