package com.sikku.removeKdigit;

import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        System.out.println(removeKdigits("10200",1));
    }
    public static String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<Integer> stack = new Stack<>();


        int count = 0;
        for(int i=0; i<n;i++){
            int ch = num.charAt(i) - '0';
            while(!stack.isEmpty() && ch<stack.peek() && count<k){
                stack.pop();
                count++;
            }
            stack.push(ch);
        }

        while(!stack.isEmpty() && count<k){
            stack.pop();
            count++;
        }

        String res = "";
        while(!stack.isEmpty()){
            res = stack.pop() + res;
        }

        System.out.println(res.charAt(0));

        while(res.length()>1 && res.charAt(0)=='0'){
            res = res.substring(1);
        }


        return res;

    }
}
