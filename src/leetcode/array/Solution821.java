package leetcode.array;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author kaili
 */
public class Solution821 {
    public int[] shortestToChar(String S, char C) {
        char[] ch = S.toCharArray();
        List<Integer> list = new LinkedList<>();
        int[] res = new int[ch.length];
        for(int i = 0 ; i < ch.length ; i ++){
            if(ch[i] == C)
                list.add(i);
        }
        for(int i : list)
            System.out.print("c的位置" + i+ " ");
        System.out.println();
        
        for(int i = 0 ; i < ch.length ; i ++){
            int count = Integer.MAX_VALUE;
            for(int j : list){
                
                count = Math.min(count, Math.abs(j-i));
            }
            System.out.print(count + " ");
            res[i] = count;
        }
        return res;
    }
    
    public static void main(String[] args){
        Solution821 s = new Solution821();
        s.shortestToChar( "loveleetcode", 'e');
    }
}
