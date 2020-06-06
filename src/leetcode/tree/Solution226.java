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
public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)    return root;
        
        TreeNode temp = invertTree(root.right);
        root.right = invertTree(root.left);
        root.left = temp;
        return root;
    }
}
