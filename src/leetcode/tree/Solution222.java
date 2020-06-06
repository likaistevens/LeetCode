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
public class Solution222 {
    public int countNodes(TreeNode root) {
        if(root.left == null && root.right == null)    return 1;
        if(root.left == null || root.right == null)    return 2;
        return countNodes(root.left) + countNodes(root.right);
    }
}
