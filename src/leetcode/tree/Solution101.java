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
public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)    return true;
        return helper(root.left,root.right);
    }
    public boolean helper(TreeNode l, TreeNode r){
        if(l == null && r == null)  return true;
        if((l == null && r != null) || (l != null && r == null))    return false;
        if(l.val != r.val)  return false;
        return helper(l.left, r.right) && helper(l.right, r.left);
    }
}
