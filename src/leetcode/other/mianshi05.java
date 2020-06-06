//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
//示例 1：
//输入：s = "We are happy."
//输出："We%20are%20happy."
package leetcode.other;

public class mianshi05 {
    public String replaceSpace(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < s.length() ; i ++){
            if (arr[i] == ' '){
                sb.append("%20");
            }
            else
                sb.append(arr[i]);
        }
        return sb.toString();
    }
    
    public static void main(String[] args){
        mianshi05 m = new mianshi05();
        m.replaceSpace("      ");
    }
}
