package com.sikku.hashmapImplementation;

public class MapUse {
    public static void main(String[] args) {
        Map<String, Integer> map = new Map<>();

        for (int i = 0; i < 20; i++) {
            map.insert("abc" + i, i * i);
            System.out.println("i " + i + " lf =" + map.loadFactor());
        }

        System.out.println(map.removeKey("abc10"));


        for (int i = 0; i < 20; i++) {
            System.out.println("abc " + i+"    " + map.getValue("abc" + i));
        }

    }
}
