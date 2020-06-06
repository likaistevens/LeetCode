/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.array;

import java.util.HashMap;

/**
 *
 * @author kaili
 */
public class Solution76 {

    public String minWindow(String s, String t) {
        int[] ss = new int[58];
        int[] tt = new int[58];
        HashMap<Integer, int[]> map = new HashMap();
        for (int n = 0; n < s.length(); n++) {
            ss[s.charAt(n) - 65]++;
        }
        for (int n = 0; n < t.length(); n++) {
            tt[t.charAt(n) - 65]++;
        }
        int i = 0;
        int j = 0;
        int len = Integer.MAX_VALUE;
        while (j < s.length()) {
            String before = s.substring(i, j+1);
            if (j < s.length() && !isContains(ss, tt, t)) {
                System.out.println("!=");
                j++;
                if(j < s.length())
                    ss[s.charAt(j) - 65] ++;
            } 
            else if(i <= j && isContains(ss, tt, t)){
                System.out.println("==");
                int[] temp = {i, j};
                if(len > j - i + 1){
                    len = Math.min(len, j - i + 1);
                    map.put(len, temp);
                }
                ss[s.charAt(i) - 65] --;
                i++;
            }
            else{
                j ++;
            }
        }

        if (len == Integer.MAX_VALUE) {
            return "";
        }

        int start = map.get(len)[0];
        int end = map.get(len)[1];
        String res = s.substring(start, end+1);
        return res;

    }

    private boolean isContains(int[] s, int[] t, String ts) {
        for (int i = 0; i < ts.length(); i++) {
            System.out.println(ts.charAt(i));
            if (s[ts.charAt(i) - 65] < t[ts.charAt(i) - 65]) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        Solution76 solu = new Solution76();
//        String S = "cabwefgewcwaefgcf";
//        String T = "cae";
        //System.out.println(solu.minWindow(S,T));
        
        
        String S = "c";
        String T = "cae";
        int[] ss = new int[58];
        int[] tt = new int[58];
        for (int n = 0; n < S.length(); n++) {
            ss[S.charAt(n) - 65]++;
        }
        for (int n = 0; n < T.length(); n++) {
            tt[T.charAt(n) - 65]++;
        }
        System.out.println(solu.isContains(ss,tt,T));
    }
}

//class Solution76_2 {
//
//    public String minWindow(String s, String t) {
//        int[] ss = new int[58];
//        int[] tt = new int[58];
//        HashMap<Integer, int[]> map = new HashMap();
//        for (int n = 0; n < s.length(); n++) {
//            ss[s.charAt(n) - 65]++;
//        }
//        for (int n = 0; n < t.length(); n++) {
//            tt[t.charAt(n) - 65]++;
//        }
//        int i = 0;
//        int j = 0;
//        int len = Integer.MAX_VALUE;
//        while (j < s.length()) {
//            if (j < s.length() && !isContains(s.substring(i, j+1), tt, t)) {
//                j++;
//            } 
//            else if(i <= j && isContains(s.substring(i, j+1), tt, t)){
//                int[] temp = {i, j};
//                if(len > j - i + 1){
//                    len = Math.min(len, j - i + 1);
//                    map.put(len, temp);
//                }
//                i++;
//            }else{
//                j ++;
//            }
//        }
//
//        if (len == Integer.MAX_VALUE) {
//            return "";
//        }
//
//        int start = map.get(len)[0];
//        int end = map.get(len)[1];
//        String res = s.substring(start, end+1);
//        return res;
//
//    }
//
//    private boolean isContains(String ss, int[] t, String ts) {
//        int[] s = new int[58];
//        for (int n = 0; n < ss.length(); n++) {
//            s[ss.charAt(n) - 65]++;
//        }
//        
//        for (int i = 0; i < ts.length(); i++) {
//            if (s[ts.charAt(i) - 65] < t[ts.charAt(i) - 65]) {
//                return false;
//            }
//        }
//        return true;
//    }
//    
//    public static void main(String[] args){
//        Solution76 solu = new Solution76();
//        String S = "cabwefgewcwaefgcf";
//        String T = "cae";
//        System.out.println(solu.minWindow(S,T));
//        System.out.println('z'-65);
//    }
//}
