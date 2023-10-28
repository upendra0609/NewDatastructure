package com.sikku;

import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "foo"));
        System.out.println(isIsomorphic("bar", "foo"));
        System.out.println(isIsomorphic("paper", "title"));

        StringBuilder sbr = new StringBuilder("afa"+"afaf");
        "as".contentEquals(sbr);
    }

    public static boolean isIsomorphic(String s1, String s2) {
        HashMap<Character, Character> map1 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if (!map1.containsKey(ch)) {
                if (!map1.containsValue(ch2)) {
                    map1.put(ch, ch2);
                } else {
                    return false;
                }
            } else {
                if (map1.get(ch) != ch2) {
                    return false;
                }
            }
        }
        return true;
    }
}
