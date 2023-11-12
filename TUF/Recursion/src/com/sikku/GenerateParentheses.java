package com.sikku;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GenerateParentheses {
    static ArrayList<String> result = new ArrayList<>();
    static int count =0;

    public static void main(String[] args) {
        generate(3, 0, 0, "");

        for (String s : result) {
            System.out.print(s + "  ");
        }
    }

    public static void generate(int n, int open, int close, String str) {
        if (open == n && close == n) {
            result.add(str);
        }

        if (open < n) {
            generate(n, open + 1, close, str+"(");
        }

        if (close < open) {
            generate(n, open, close + 1, str+")");
        }
    }
}
