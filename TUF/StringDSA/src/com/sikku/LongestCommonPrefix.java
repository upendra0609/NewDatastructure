package com.sikku;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
//        System.out.println(longestCommonPrefix(strs));
        System.out.println("flow".indexOf("flow"));;
    }
    // best
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int index = 1; index < strs.length; index++) {
            while (strs[index].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    public static String longest(String[] strs){
        if(strs.length == 1) return strs[0];
        if(strs[0].length()==0) return "";

        int i=0;
        String result = "";
        while(i<strs[0].length()){
            char ch = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++){
                if(i>=strs[j].length()){
                    return result;
                }
                if(strs[j].charAt(i)!=ch){
                    return result;
                }
            }
            result += ch;
            i++;
        }
        return result;
    }
}
