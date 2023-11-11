package com.sikku;

import java.util.ArrayList;
import java.util.List;

public class BinaryString {
    public static void main(String[] args) {

    }

    private static List<String> list= new ArrayList<>();
    public static List< String > generateString(int n) {
        if(n==1){
            List<String> tempList = new ArrayList<>();
            tempList.add("0");
            tempList.add("1");
            return tempList;
        }

        List<String> l = generateString(n-1);
        for(String s: l){
            if(s.endsWith("0")){
                list.add(s+"1");
                list.add(s+"0");
            }else{
                list.add("0");
            }
        }
        return list;

    }
}


class Solution {

    public static List< String > generateString(int N) {

        List<String> ans = new ArrayList<String>();

        helper(N,"", ans);

        return ans;

    }

    public static void helper(int N, String curr, List<String> ans){

        if(N==0){

            ans.add(curr);

            return;

        }

        if(curr.isEmpty() || curr.charAt(curr.length()-1)=='0'){

            helper(N-1,curr+"0", ans);

            helper(N-1,curr+"1", ans);

        }else{

            helper(N-1,curr+"0", ans);

        }

    }

}
