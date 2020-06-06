/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.array;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author kaili
 */
public class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new LinkedList<>();
        if(s.length() < p.length()){
            list.add(-1);
            return list;
        }
        if(s.length() == p.length()){
            list.add(0);
            System.out.println("+0");
            return list;
        }
                int n = p.length();

        int i = 0, j = i + n - 1;
        while(j < s.length()){
            if(isAnagram(s,p,i,j))
                list.add(i);
            i ++;
            j = i + n - 1;
        }
        return list;
    }
     
    private boolean isWord(String s, String p, int i, int j){
        HashMap<Character,Integer> map = new HashMap<>();
        for(; i <= j; i ++){
            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), 1);
            else
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
        }
        for(int k = 0 ; k < p.length() ; k ++){
            if(!map.containsKey(p.charAt(k)))
                return false;
            if(map.get(p.charAt(k)) > 1)
                map.put(p.charAt(k),map.get(p.charAt(k))-1);
            else if(map.get(p.charAt(k)) == 1)
                map.remove(p.charAt(k));
        }
        if(map.isEmpty())
            return true;
        return false;
    }
    
    private boolean isAnagram(String s, String p, int i, int j){
       char[] need = new char[26];
       for(; i <= j ; i ++ ){
           need[s.charAt(i)-97] ++;
       }
       for(int k = 0; k < p.length() ; k ++){
           need[p.charAt(k)-97] --;
       }
       for(int m = 0 ; m < 26 ; m ++){
           if(need[m] != 0)
               return false;
       }
       return true;
    }
    
    public static void main(String[] args){
        Solution438 solu = new Solution438();
        String s =  "abab" ;
        String p =  "ab";
        //System.out.println(solu.isWord(s, p, 6, 8));
        for(int std : solu.findAnagrams(s, p))
            System.out.print(std + " ");

    }
}
