package leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author kaili
 */
public class Solution345 {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] ch = s.toCharArray();
        while(true){
            while(i < s.length() && !isVowel(ch[i])) {
                i ++;
            }
            while(j > 0 && !isVowel(ch[j])) {
                j --;
            }
            if(i >= j)
                break;
            swap(ch,i,j);
            i ++;
            j --;
        }
        return new String(ch);
    }
    
    private void swap(char[] ch, int i, int j){
        char c = ch[i];
        ch[i] = ch[j];
        ch[j] = c;
    }
    
    private boolean isVowel(char ch) {
        // 这里要直接用 return 语句返回，不要返回 true 或者 false
         return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                ||ch=='A'|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
    
    public static void main(String[] args){
        Solution345 s = new Solution345();
        System.out.println(s.reverseVowels("LeetCode"));
    }
}
