package leetcode.array;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author kaili
 */
public class Solution3 {

    public int lengthOfLongestSubstring(String s) {
        if (s.equals("")) {
            return 0;
        }
        char[] ch = s.toCharArray();
        int j = 0, len = 1;
        Queue<Character> set = new LinkedList<>();
        set.add(ch[j]);
        while (j < ch.length - 1) {
            while (j < ch.length - 1 && !set.contains(ch[j + 1])) {
                set.add(ch[j + 1]);
                j++;
            }
            len = Math.max(len, set.size());
            while (j < ch.length - 1 && set.contains(ch[j+1])) {
                set.poll();
            }
            if (j < ch.length - 1) {
                set.add(ch[j + 1]);
                j++;
            } else {
                break;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.lengthOfLongestSubstring("au"));
    }
}
