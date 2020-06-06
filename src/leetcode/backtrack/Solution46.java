package leetcode.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author kaili
 */
public class Solution46 {
    boolean[] used;
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList();

        if(nums.length == 0)   return res;
        List<Integer> list = new ArrayList();
        used = new boolean[nums.length];
        Arrays.fill(used, false);
        generate(nums, 0,list);
        return res;
    }

    void generate(int[] nums,  int index,List list){
        if(index == nums.length){
            res.add(new ArrayList<>(list));
            for(List l : res){
                System.out.println("+++"+l);
            }
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!used[i]){
                list.add(nums[i]);
                System.out.println(list+"---");
                used[i] = true;
                generate(nums,index + 1, list);
                list.remove(list.size()-1);
                System.out.println("***"+list);
                used[i] = false;
            }
        }
        return;
    }
    
    public static void main(String[] args){
        int[] nums = {1,2,3};
        Solution46 s = new Solution46();
        for(List l : s.permute(nums)){
            System.out.println(l);
        }
    }
}
