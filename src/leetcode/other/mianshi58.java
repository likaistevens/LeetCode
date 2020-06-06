//字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
//示例 1：
//输入: s = "abcdefg", k = 2
//输出: "cdefgab"
package leetcode.other;

import java.util.ArrayList;

public class mianshi58 {
    public String reverseLeftWords(String s, int n) {
        char[] list = s.toCharArray();
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();
        for(int i = 0 ; i < list.length ; i ++){
            if(i < n)
                s1.append(list[i]);
            else
                s2.append(list[i]);
        }
        s2.append(s1);
        System.out.println(s2.toString());
        return s2.toString();
    }
    
    public static void main(String[] args){
        mianshi58 m = new mianshi58();
        m.reverseLeftWords("abcdefg", 2);
    }
}
