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
public class miansh27 {
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null) return null;
        
        TreeNode node = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(node);
        
        return root;
    }
}
