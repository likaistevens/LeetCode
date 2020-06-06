//编写一个函数来查找字符串数组中的最长公共前缀。
//如果不存在公共前缀，返回空字符串 ""。
package leetcode.array;

/**
 *
 * @author kaili
 */
public class Solution14 {
    //水平扫描法，先把str[0]当作LCP，对第i个字符串循环，看 indexof是不是为0，不是零就表明不是公共前缀，就把第0个字符串末尾去掉，再看是不是。
    
    public String longestCommonPrefix(String[] strs) {
        
        
        if(strs.length == 1 || strs.length == 0) return strs.length !=0 ? strs[0] : "";
        String pre = strs[0];
        for(int i = 0 ; i < strs.length ; i ++){
            while(strs[i].indexOf(pre) != 0){
                System.out.println(pre);
                pre = pre.substring(0,pre.length() - 1);
                System.out.println(pre);
            }
        }
        System.out.println("final " + pre);
        return pre;
    }    
    public String longestCommonPrefix5(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    for (int i = 0; i < strs[0].length() ; i++){
        char c = strs[0].charAt(i);
        for (int j = 1; j < strs.length; j ++) {
            if (i == strs[j].length() || strs[j].charAt(i) != c)
                return strs[0].substring(0, i);             
        }
    }
    return strs[0];
}
    //垂直扫描，假设末位是一个很短的字符串，水平扫描就会把所有的字符个数都扫描完。垂直扫描，就对比每个字符串下标相同的字符
    public String longestCommonPrefix2(String[] strs) {
        if(strs.length == 1 || strs.length == 0) return strs.length !=0 ? strs[0] : "";
        // the charat[j]
        for(int j = 0; j < strs[0].length() ; j ++){
             char ch = strs[0].charAt(j);
             // the strs[i]
             for(int i = 1 ; i < strs.length ; i ++){
                 // j == strs[i].length() 表示已经已经匹配到最短字符串，下表越界了
                 if(j == strs[i].length() || ch != strs[i].charAt(j)){
                     System.out.println(strs[0].substring(0,j));
                     return strs[0].substring(0,j);
                 }
             }
        }   
        System.out.println(strs[0]);
        return strs[0];
    } 
    
    //分治
    public String longestCommonPrefix3(String[] strs) {
        if(strs.length == 1 || strs.length == 0) return strs.length !=0 ? strs[0] : "";
        
        return longestCommonPrefix3(strs, 0 , strs.length - 1);
    }
    
  
    private String longestCommonPrefix3(String[] strs ,int l ,int r) {
        if(l == r) return strs[l];
        int mid = (r - l ) / 2;
        String strl = longestCommonPrefix3(strs ,l , mid);
        String strr = longestCommonPrefix3(strs ,mid + 1, r);
        return commonPrefix(strl, strr);
    }
    
    String commonPrefix(String left,String right) {
    int min = Math.min(left.length(), right.length());       
    for (int i = 0; i < min; i++) {
        if ( left.charAt(i) != right.charAt(i) )
            return left.substring(0, i);
    }
    return left.substring(0, min);
}

    private String combine(String strl, String strr){
        int min = Math.min(strl.length(), strr.length());       
        for(int i = 0 ; i < min ; i ++){
            if(strl.charAt(i) != strr.charAt(i))
                return strl.substring(0, i);
        }
        return strl.substring(0, min);
    }

    public static void main(String[] args){
        Solution14 m = new Solution14();
        String[] strs = new String[]{"flower","flow","flight"};
        System.out.println(m.longestCommonPrefix3(strs));
    }
}
//"dog","racecar","car"
//["flower","flow","flight"]