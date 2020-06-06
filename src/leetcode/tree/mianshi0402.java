/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.tree;

import java.util.Arrays;

/**
 *
 * @author kaili
 */
public class mianshi0402 {
    
    // 数组中间作为root，左边放左子树，右边放右子树，然后递归，把左边数组递归，右边数组也递归
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        
        TreeNode node = new TreeNode(nums[nums.length/2]);
        node.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, nums.length/2));
        node.right= sortedArrayToBST(Arrays.copyOfRange(nums, nums.length/2+1, nums.length));
        return node;
    }
    
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6};
        int[] newnum = Arrays.copyOfRange(nums, 0, 2);
        for(int i : newnum)
            System.out.println(i);
    }
}
