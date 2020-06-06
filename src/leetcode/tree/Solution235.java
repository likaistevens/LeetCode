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
public class Solution235 {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root.val == p.val || root.val == q.val || (p.val < root.val && q.val > root.val) || (p.val > root.val && q.val < root.val)) {
            return root;
        }else if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }else if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        // p 和 q不在这棵树中
        return null;
    }

    public static void main(String[] args){
        Integer[] array = {6,2,8,0,4,7,9,null,null,3,5};
        TreeNode root = new TreeNode(array);
        System.out.println(lowestCommonAncestor(root.right));
    }
}
