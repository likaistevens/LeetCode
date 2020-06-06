/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.tree;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) return null;
        if(t1 == null) 
            ;
        if(t2 == null) t2.val = 0;
        else
            t1.val += t2.val;
        
        t1.left = mergeTrees(t1.left,t2.left);
        t1.right = mergeTrees(t1.right,t2.right);
        
        return t1;
    }
}