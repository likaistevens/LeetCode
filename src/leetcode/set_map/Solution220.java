package leetcode.set_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author kaili
 */
public class Solution220 {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<>();
        for(int i = 0; i < nums.length; i++){
            // 和 int c效果一样，但是int c没法跟null比较。     判断是否null是set开始没有元素的第一次判断。   
            Long c = set.ceiling((long)nums[i]);
            if(c != null && c - (long)nums[i] <= t)
                return true;
            Long f = set.floor((long)nums[i]);
            if(f != null && (long)nums[i] - f <= t)
                return true;
            
            // 这个添加元素一定要卸载判断之后，因为，如果先添加，nums[i]进入了set，那么就可能导致floor和ceil为自己，自己跟自己比较
            // 想象一下第一次，i=0的时候，如果先添加，就会拿自己跟自己比较
            set.add((long)nums[i]);
            if(set.size() > k)
                set.remove((long)nums[i - k]);
        }
        return false;
    }
    
    public static void main(String[] args){
//        int[] nums = {1,2,3,1};
//        int k = 3, t = 0;
//        int[] nums = {1,0,1,1};
//        int k = 1, t = 2;
//        int[] nums = {1,5,9,1,5,9};
//        int k = 2, t = 3;
//        int[] nums = {1};
//        int k = 1, t = 1;
//        int[] nums = {2,2};
//        int k = 3, t = 0;
//        int[] nums = {3,6,0,4};
//        int k = 2, t = 2;
        int[] nums = {-1,2147483647};
        int k = 1, t = 2147483647;
        System.out.println(containsNearbyAlmostDuplicate(nums,k,t));
        Integer f = 2147483647;
        int g = 2147483647;
        System.out.println(g + f);
        
    }
}
