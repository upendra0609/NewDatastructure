package com.sikku;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        // Create a HashMap and add elements
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('c', 4);
        map.put('b', 9);
        map.put('d', 7);



        // Convert the HashMap to a List of Map.Entry objects
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());


        // Sort the List by values using a lambda expression
        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        for (Map.Entry<Character,Integer> x: entryList){
            System.out.println(x.getKey()+"  "+x.getValue());
        }
/*
        // Create a new LinkedHashMap to maintain the order of the sorted List
        LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Print the sorted Map
        for (Map.Entry<Character, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
 */
    }
}
