package leetcode.set_map;

/**
 *
 * @author kaili
 */
public class Solution205 {

    public boolean isIsomorphic(String s, String t) {
        char[] map = new char[128];

        for (int i = 0; i < s.length(); i++) {
            if (map[s.charAt(i)] == '\0') {
                if(!isContains(map, t.charAt(i)))
                    map[s.charAt(i)] = t.charAt(i);
                else
                    return false;
            }
            else{
                if(map[s.charAt(i)] != t.charAt(i))
                    return false;
            }
        }
        return true;
    }
            
    private boolean isContains(char[] ch, char c) {
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == c) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[] ts = new char['z' - '0'];
        char[] ch = "abcdefghijklmnopqrstuvwxyznopqrstuvwxyzabcdefghijklm".toCharArray();
        for (char i : ch) {
            if(i != '\0')
                System.out.println(i + 0 - '0');
        }
        System.out.println('z'+0);
    }
}
