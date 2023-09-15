package com.sikku;

public class CharacterHashing {
    public static void main(String[] args) {
        String str = "absdhasahsahsjfghjghabsfhab";
        int[] hash = new int[256];   //if upper/lower and all character considered, if only lower case take 26 size

//        for (int i = 0; i < str.length(); i++) {
//            int index = str.charAt(i);
//            hash[index-97] += 1;
//        }

        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i);
            hash[index] += 1;
        }

        System.out.println(hash['a']);
        System.out.println(hash['b']);
        System.out.println(hash['c']);
    }
}
