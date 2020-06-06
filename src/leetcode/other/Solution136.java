/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.other;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author kaili
 */
public class Solution136 {
    // 异或运算
    // 一个数和 0 做 XOR 运算等于本身：a⊕0 = a,
    // 一个数和其本身做 XOR 运算等于 0：a⊕a = 0, 
    // XOR 运算满足交换律和结合律：a⊕b⊕a = (a⊕a)⊕b = 0⊕b = b
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i : nums)
            ans ^= i;
        return ans;
    }
    // 数学方法 。  2(a+b+c) - (a+a+b+b+c)
    public int singleNumber2(int[] nums) {
        HashSet s = new HashSet();
        int a = 0;
        int b = 0;
        for(int i : nums){
            s.add(i);
            a += i;
        }
        for(Object i : s)
            b += (int)i;
        
        return (2*b-a);
    }
    
    // 放入map或者set，有就出，没有就进
    public int singleNumber3(int[] nums) {
        HashMap map = new HashMap();
        for(int i : nums){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }else{
                map.remove(i);
            }
        }
        int ans = 0;
        for(Object i : map.keySet())
            ans = (int)i;
        return ans;
    }
}
