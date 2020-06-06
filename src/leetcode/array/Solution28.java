//实现 strStr() 函数。
//给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
package leetcode.array;

/**
 *
 * @author kaili
 */
public class Solution28 {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0 && haystack.length() == 0) return 0;
        if (needle.length() == 0) return 0;
        
            
        for(int i = 0 ; i < haystack.length() - needle.length() + 1; i ++){
            if(haystack.charAt(i) == needle.charAt(0)){
                int j = 0;
                while(j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)){
                    j ++;
                }
                if(j == needle.length())
                    return i;
                else 
                    continue;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Solution28 s = new Solution28();
        System.out.println("final "+s.strStr("mississippi","issip"));
    }

}
