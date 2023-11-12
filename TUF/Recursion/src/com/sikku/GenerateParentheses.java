package com.sikku;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    static ArrayList<String> result = new ArrayList<>();

    public static void main(String[] args) {
        generate(4, 0, 0, "");

        for (String s : result) {
            System.out.print(s + "  ");
        }
    }

    public static void generate(int n, int open, int close, String str) {
        if (open == n && close == n) {
            result.add(str);
//            str = "";
        }

        if (open < n) {
//            str = str + "(";
            generate(n, open + 1, close, str+"(");
        }

        if (close < open) {
//            str = str + ")";
            generate(n, open, close + 1, str+")");
        }
    }
}
