package leetcode.other;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author kaili
 */
public class Solution728 {

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new LinkedList<>();
        for (int i = left; i <= right; i++) {
            if(isSelfDivided(i)){
            
            System.out.println(i);
                list.add(i);}
        }
        return list;
    }

    private static boolean isSelfDivided(int a) {
        int n = (a + "").length();
        int b = a;
        for(int i = 0 ; i < n ; i ++){
            int count = b % 10;
            if(count == 0) return false;
            if(a % count == 0){
                b /= 10;
            }else{
                return false;
            }    
        }
        return true;
    }

    public static void main(String[] args) {
//        List list = selfDividingNumbers(66, 708);
//        for(Object i : list)
//            System.out.println((int)i);
        System.out.println(isSelfDivided(101));
    }
}
