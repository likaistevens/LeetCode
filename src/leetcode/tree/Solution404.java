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
public class Solution404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)    return 0;
        if(root.left == null)   
            return sumOfLeftLeaves(root.right);
        if(root.left.left == null && root.left.right == null)  
            return root.left.val + sumOfLeftLeaves(root.right);
        
        return sumOfLeftLeaves(root.right) + sumOfLeftLeaves(root.left);
    }
}
