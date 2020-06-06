/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.Queue_Stack;

import java.util.Stack;

//1.整数（一轮的得分）：直接表示您在本轮中获得的积分数。
//2. "+"（一轮的得分）：表示本轮获得的得分是前两轮有效 回合得分的总和。
//3. "D"（一轮的得分）：表示本轮获得的得分是前一轮有效 回合得分的两倍。
//4. "C"（一个操作，这不是一个回合的分数）：表示您获得的最后一个有效 回合的分数是无效的，应该被移除。

public class Solution682 {
    public static int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack();
        int sum = 0;
        for(String s : ops){
            if(s.equals("+")){
                int top = stack.pop();
                int score = stack.peek() + top;
                stack.add(top);
                stack.add(score);
            }else if(s.equalsIgnoreCase("D")){
                int score = stack.peek() * 2;
                stack.add(score);
            }else if(s.equalsIgnoreCase("C")){
                stack.pop();
            }else{
                stack.add(Integer.parseInt(s));
            }
        }
        int add = 0;
        while(!stack.isEmpty()){
            add= stack.pop();
            sum += add;
        }
        return sum;
        
    }
    
   public static void main(String[] args){
       Solution682 s = new Solution682();
       String[] ss = {"5","2","C","D","+"};
       System.out.println(calPoints(ss));
   }
}
