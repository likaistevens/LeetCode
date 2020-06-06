package leetcode.linedklist;

import java.util.TreeSet;

/**
 *
 * @author kaili
 */
public class Solution804 {
    public int uniqueMorseRepresentations(String[] words) {
        String [] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        TreeSet<String> set = new TreeSet<>();
        for(String word : words){
            StringBuilder res = new StringBuilder();
            for(int i = 0 ; i < word.length() ; i ++)
                res.append(codes[word.charAt(i) - 'a']);
            set.add(res.toString());
        }
        return set.size();
    }
}