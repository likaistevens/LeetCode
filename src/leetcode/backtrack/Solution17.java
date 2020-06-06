package leetcode.backtrack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution17 {
    static Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    public static List<String> letterCombinations1(String digits) {
        int end = digits.length();
        return recursion(digits, end);
    }
    public static List<String> recursion(String digits, int end){
        end = end - 1;
        List<String> res = new ArrayList<>();
        if(end < 0) return res;
        if(end == 0){
            String temp = phone.get(digits.substring(0,1));
            for(int i = 0; i < temp.length(); i++){
                res.add(temp.charAt(i)+"");
            }
            return res;
        }
        res = helper(digits.substring(end, end+1), recursion(digits.substring(0, end),end));
        return res;
    }
    // 吧 digit这个新加的数字的字符串跟后面已有的拼接起来
    public static List<String> helper(String digit, List<String> s){
        List<String> res = new ArrayList<>();
        String st = phone.get(digit);
        for(int i = 0; i < st.length(); i ++){
            for(int j = 0; j < s.size(); j++){
                res.add(s.get(j) + st.charAt(i));
            }
        }
        return res;
    }
    
    static List<String> res = new ArrayList();
    public static List<String> letterCombinations(String digits){
        if(digits.length() == 0)    return res;
        back_track(digits, 0, "");
        return res;
    }
    static void back_track(String digits, int index, String s){
        int n = digits.length();
        if(s.length() == n){
            res.add(s);
            return ;
        }
        String temp = phone.get(digits.charAt(index)+"");
        System.out.println(temp);
        for(int i = 0; i < temp.length(); i++)
            back_track(digits, index + 1, s + temp.charAt(i));
    }
    
    
    public static void main(String[] args){
//        String digit = "2";
//        List<String> s = new ArrayList<>();
//        s.add("ni");
//        s.add("jk");
//        s.add("ok");
//        System.out.println(helper(digit,s));
        String  digits = "234";
        System.out.println(letterCombinations(digits));
        
    }
}
