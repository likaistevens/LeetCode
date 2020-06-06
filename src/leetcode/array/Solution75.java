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
public class Solution75 {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        for(int i = 0 ; i < nums.length ; i ++){
            count[nums[i]-1]++;
        }
        for(int i = 0 ; i < count[0]; i ++){
            nums[i] = 1;
        }
        for(int i = count[0] ; i < count[1] + count[0]; i ++){
            nums[i] = 2;
        }
        for(int i = count[1] + count[0] ; i < nums.length; i ++){
            nums[i] = 3;
        }
    }
    
    public void sortColors2(int[] nums) {
        // [0, zero]             0
        // [zero + 1, i)         1
        // [two, nums.length-1]  2
        int zero = -1;
        int i = 0;
        int two = nums.length;
        while(i < two){
            if(nums[i] == 0){
                swap(nums,zero+1,i);
                zero ++;
                i ++;
            }
            else if(nums[i] == 1)
                i ++;
            else if(nums[i] == 2){
                swap(nums,two-1,i);
                two --;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }   
    
    public static void main(String[] args){
        Solution75 s = new Solution75();
        int[] nums = {0,1,0};
        s.sortColors2(nums);
        for(int i : nums)
            System.out.print(i + " ");
    }    
}
