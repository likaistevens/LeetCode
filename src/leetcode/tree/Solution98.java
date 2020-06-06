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
public class Solution98 {
    public boolean isValidBST2(TreeNode root) {
        return root == null || isValidBST(root, root.val);
    }
    public boolean isValidBST(TreeNode root, int num) {
        if(root == null || (root.left == null &&  root.right == null))    return true;
        if(root.left != null && root.left.val >= root.val)   return false;
        if(root.left != null && ((root.left.left != null && root.left.left.val >= num) || (root.left.right != null && root.left.right.val >= num)))    return false;
        if(root.right != null && root.right.val <= root.val)   return false;
        if(root.right != null && ((root.right.left != null && root.right.left.val <= num) || (root.right.right != null && root.right.right.val <= num)))    return false;
        return isValidBST(root.left,root.val) && isValidBST(root.right,root.val);
    }
    public boolean isValidBST(TreeNode root) {
        if(root == null || (root.left == null &&  root.right == null))    return true;
        if(root.left != null && root.left.val >= root.val)   return false;
        if(root.left != null && ((root.left.left != null && root.left.left.val >= root.val) || (root.left.right != null && root.left.right.val >= root.val)))    return false;
        if(root.right != null && root.right.val <= root.val)   return false;
        if(root.right != null && ((root.right.left != null && root.right.left.val <= root.val) || (root.right.right != null && root.right.right.val <= root.val)))    return false;
        return isValidBST(root.left) && isValidBST(root.right);
    }
}
