package JavaCollectionsInOneVideo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class IntroMap {
    // Stores Key, value pair
    // Key should be unique else value will be replaced by new value for same key

    public static void map () {
        Map<String, Integer> m = new HashMap<>(); // Operations: O(1)
        m.put("One", 1);
        m.put("Two", 2);
        m.put("Three", 3);

        if (!m.containsKey("Two")) {
            // Validation to avoid replacing existing values
            m.put("Two", 69);
        }

        // Same check like above
        m.putIfAbsent("Two", 70);

        for (Map.Entry<String, Integer> e : m.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for (String s : m.keySet()) {
            System.out.println(s);
        }

        for (Integer i : m.values()) {
            System.out.println(i);
        }

        System.out.println(m.containsValue(3));
        System.out.println(m.isEmpty());
        System.out.println(m);
        m.clear();
        System.out.println(m);

        Map<String, Integer> mt = new TreeMap<>(); // Operations: O(logN) sorted order
        mt.put("One", 1);
        mt.put("Two", 2);
        mt.put("Three", 3);

        if (!mt.containsKey("Two")) {
            // Validation to avoid replacing existing values
            mt.put("Two", 69);
        }

        // Same check like above
        mt.putIfAbsent("Two", 70);

        for (Map.Entry<String, Integer> e : mt.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for (String s : mt.keySet()) {
            System.out.println(s);
        }

        for (Integer i : mt.values()) {
            System.out.println(i);
        }

        System.out.println(mt.containsValue(3));
        System.out.println(mt.isEmpty());
        System.out.println(mt);
        mt.remove("Three");
        System.out.println(mt);
        m.clear();
        System.out.println(mt);
    }
}
