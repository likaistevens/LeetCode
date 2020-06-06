/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.array;

/**
 *
 * @author kaili
 */
public class Solution283 {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=1;
        while(true){
            // 加到i的位置为0
            while(i< nums.length && nums[i] != 0)
                i ++;
            // 加到j的位置不为0
            j = i;
            while(j < nums.length && nums[j] == 0)
                j ++;
            
            if(j >= nums.length || i >= nums.length) break;
            
            nums[i] = nums[j];
            nums[j] = 0;
            i ++;
            j ++;
        }
    }
    
    public void moveZeroes2(int[] nums) {
		if(nums==null) {
			return;
		}
		//两个指针i和j
		int j = 0;
		for(int i=0;i<nums.length;i++) {
			//当前元素!=0，就把其交换到左边，等于0的交换到右边
			if(nums[i]!=0) {
				int tmp = nums[i];
				nums[i] = nums[j];
				nums[j++] = tmp;
			}
		}
	}
    
    public static void main(String[] args){
        Solution283 s = new Solution283();
        int[] nums = {4,2,4,0,0,3,0,5,1,0};
        s.moveZeroes(nums);
        for(int i : nums)
            System.out.println(i);
    }
}
