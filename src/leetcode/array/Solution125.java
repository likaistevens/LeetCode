package leetcode.array;

/**
 *
 * @author kaili
 */
public class Solution125 {
    public static boolean isPalindrome(String s) {
        char[] ch = s.toLowerCase().toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while(true){
            while(i < ch.length - 1 && !Character.isLetterOrDigit(ch[i]))
                i ++;
            while(j > 0 && !Character.isLetterOrDigit(ch[j]))
                j --;
            if(i >= j)
                break;
            if(ch[i]==ch[j]){
                i ++;
                j --;
            }else{
                return false;
            }
            
        }
        return true;
    }
    
    public static void main(String[] args){
        String s= ".,";
//        StringBuilder sb = new StringBuilder();
//        char[] ch = s.toLowerCase().toCharArray();
//        for(char c : ch)
//            System.out.println(c + " " );

        System.out.println(isPalindrome(s));
    }
}
