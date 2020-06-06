/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.set_map;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author kaili
 */
public class Solution500 {

    public String[] findWords(String[] words) {
        Queue newwords = new LinkedList();
        for(int i = 0 ; i < words.length ; i ++){
            if(isline(words[i]))
                newwords.add(words[i]);
        }
        String[] ret = new String[newwords.size()];

        for(int i = 0 ; i < ret.length ; i ++){
            if(!newwords.isEmpty())
                ret[i] = newwords.remove()+"";
        }
        return ret;
    }

    private boolean isline(String word) {
        int[] key = {2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3};
        int stand = key[word.toUpperCase().charAt(0)-65];
        for(int i = 1 ; i < word.length() ; i ++){
            if(key[word.toUpperCase().charAt(i)-65] != stand)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args){
        Solution500 s = new Solution500();
        String[] words = {"Hello","Alaska","Dad","Peace"};
        for(int i = 0 ; i < s.findWords(words).length ; i ++){
            System.out.println(s.findWords(words)[i]);
        }
        System.out.println(s.isline("Alaska"));
    }

}
