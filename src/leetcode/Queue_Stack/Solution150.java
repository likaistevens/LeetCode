/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.Queue_Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 *
 * @author kaili
 */
public class Solution150 {
    public static int evalRPN(String[] tokens) {
//        Stack<Integer> num = new Stack<>();
        Deque<Integer> num = new ArrayDeque<>();
        int a = 0, b = 0;
        for(String s : tokens){
            System.out.println(s);
            if(s.charAt(s.length()-1) + 0 < 58 && s.charAt(s.length()-1) + 0 > 47){
                num.add(Integer.parseInt(s));
            }else{
                b = num.pop();
                a = num.pop();
                if(s.equals("+"))
                    num.add(a + b);
                else if(s.equals("-"))
                    num.add(a - b);
                else if(s.equals("*"))
                    num.add(a * b);
                else if(s.equals("/"))
                    num.add(a / b);
            }
        }
        return num.peek();
    }
    
    public static void main(String[] args){
        String[] s = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(s));
    }
}
