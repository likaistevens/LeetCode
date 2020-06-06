//给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
package leetcode.other;

/**
 *
 * @author kaili
 */
public class Solution1281 {
    public int subtractProductAndSum(int n) {
        int pro = 1;
        int sum = 0;
        while(n > 0){
            int num = n % 10;
            pro *= num;
            sum += num;
            n /= 10;
        }
        return pro - sum;
    }
}
// 分离整数各个位数字的方法，   while(n > 0){
//                                int num = n % 10;
//                                n /= 10;
//                            }
// 另外，可以将int转化为string来统计位数 
