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
public class Solution450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode parent = root;
        TreeNode child = root;
        while(parent.left != null || parent.left != null){
            if(parent.left.val == key || parent.right.val == key){
                child = parent.left.val == key ? parent.left : parent.right;
                break;
            }
            if(parent.val > key){
                parent = parent.left;
            }else{
                parent = parent.right;
            }
        }
        // child 是叶子结点
        if(child.left == null && child.right == null){
            if(parent.val > child.val){
                parent.left = null;
                return root;
            }else{
                parent.right = null;
                return root;
            }
        }
        
        TreeNode suc = child.right
    }
}
