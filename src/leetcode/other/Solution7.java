//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
package leetcode.other;

import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author kaili
 */
public class Solution7 {
    public int reverse(int x) {
        Long res = 0L;
        int flag = 1;
        if(x < 0){
            x *= -1;
            flag = -1;
        }
        while(x > 0){
            res = res * 10 + x % 10;
            x /= 10;
        }
        System.out.println(res);
        if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE){
            return 0;}
        //return res.intValue();
        return (flag < 0 ? -res.intValue() : res.intValue());
    }
    public static void main(String[] args){
        Solution7 s = new Solution7();
        System.out.println(s.reverse(-2147483648));
    }
}
