//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//示例 1:
//输入: 121
//输出: true
//示例 2:
//输入: -121
//输出: false
//解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
package leetcode.other;

import java.util.Stack;

/**
 *
 * @author kaili
 */
public class Solution9 {
    public boolean isPalindrome(int x) {
        int fast = 0;
        int slow = 0;
        int j = 0;
        String s = x + "";
        char[] nums = new char[s.length()];
        nums = s.toCharArray();
        Stack stack = new Stack();
        while(fast < nums.length){
            fast += 2;
            slow ++;
        }
        for(int i = 0 ; i < nums.length - slow ; i ++){
            stack.add(nums[slow + i]);
        }
        while(!stack.isEmpty()){
           if((char)stack.peek() == nums[j]){
               System.out.println((char)stack.peek() + "=" + nums[j]);
               stack.pop();
               j ++;
           }
           else
               return false;
        }
        return true;
    }
    public static void main(String[] args){
        Solution9 s = new Solution9();
        System.out.println(s.isPalindrome(134565431));
    }
}
