package leetcode.other;

/**
 *
 * @author kaili
 */
public class Solution171 {
    public static int titleToNumber(String s) {
        char[] ch = s.toCharArray();
        int res = 0;
        for(int i = 0 ; i < ch.length ; i ++){
            res += (ch[i] - 64) * Math.pow(26, s.length() - i - 1); 
        }
        return res;
    }
    
    public static void main(String[] args){
        //System.out.println(("AA".charAt(0)-64)*26+"AA".charAt(1));
        System.out.println(("Y".charAt(0)-64));
        System.out.println(titleToNumber("A"));
    }
}
