/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.Queue_Stack;

import java.util.Stack;

/**
 *
 * @author kaili
 */
public class Solution71 {
    public static String simplifyPath(String path) {
        String[] string = path.split("/");
        Stack<String> stack = new Stack();
        for(String s: string){
            System.out.println(s);
            if(s.equals("..")){
                if(!stack.empty())
                    stack.pop();
            }else if(s.equals("") || s.equals(".")){
                continue;
            }else{
                stack.push(s);
            }
        }
        if(stack.empty())   return "/";
        StringBuilder sb = new StringBuilder();
        for(String s: stack){
            sb.append("/");
            sb.append(s);
        }
        return sb.toString();
    }
    
    public static void main(String[] args){
        String path = "/a/./b/../../c/";
        System.out.println(simplifyPath(path));
    }
}
