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
public class Solution112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)    return false;
        if(root.val == sum && root.left == null && root.right == null) return true;
        
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right , sum - root.val);
    }
}
