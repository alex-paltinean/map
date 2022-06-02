package com.fasttrack;

import java.util.HashMap;
import java.util.Set;

public class MapExcercise {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("Alex", "Paltinean");
        map.put("George", "Cosbuc");
        System.out.println(map);

        System.out.println(map.get("Alex"));

        map.remove("George");
        System.out.println(map);

        map.put("Mihai", "Eminescu");

        Set<String> keys = map.keySet();
        System.out.println(keys);

        System.out.println(map.values());
    }
}
