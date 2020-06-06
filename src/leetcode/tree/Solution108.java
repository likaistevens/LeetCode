/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.tree;

/**
 *
 * @author kaili
 */
public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)    return null;
        return helper(nums,0,nums.length - 1);
    }
    public TreeNode helper(int[] nums, int l, int r){
        if(l == r)  return new TreeNode(nums[l]);
        if(r == l + 1) {
            TreeNode re = new TreeNode(nums[l]);
            re.right = new TreeNode(nums[r]);
            return re;
        }
        int mid = (r - l) / 2 + l;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums,l, mid - 1);
        root.right = helper(nums, mid + 1, r);
        return root;
    }
}
