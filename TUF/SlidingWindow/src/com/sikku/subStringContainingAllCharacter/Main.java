package com.sikku.subStringContainingAllCharacter;

public class Main {
    public static void main(String[] args) {
        System.out.println(max("acbbcac"));
        System.out.println(max("abcabc"));
    }

    public static int max(String s) {
        int n = s.length();
        StringBuilder sbr = new StringBuilder();
        int right = 0;
        int count = 0;

        while (right < n) {
            char ch = s.charAt(right);
            sbr.append(ch);
            String temp = sbr.toString();
            while (temp.contains("a") && temp.contains("b") && temp.contains("c")) {
                count += (n - right);
                sbr.deleteCharAt(0);
                temp = sbr.toString();
            }
            right++;
        }
        return count;
    }

    public static int numberOfSubstringsBetter(String s) {
        int cnt_a=-1, cnt_b=-1, cnt_c=-1;

        int i=0, res=0;
        for(char ch : s.toCharArray()){
            if(ch == 'a') cnt_a = i;
            else if(ch == 'b') cnt_b = i;
            else cnt_c= i;

            if(i>1) res += (Math.min(cnt_a, Math.min(cnt_b, cnt_c)) +1);
            i++;
        }
        return res;
    }
}
