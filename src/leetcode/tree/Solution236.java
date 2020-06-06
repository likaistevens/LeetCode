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
public class Solution236 {
    static int count = 0;
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)    return null;
        if(root.val == p.val || root.val == q.val)  return root;
        count = 0;
        helper(root.left,p.val,q.val);
        if(count == 2){
            return lowestCommonAncestor(root.left,p,q);
        }
        count = 0;
        helper(root.right,p.val,q.val);
        if(count == 2){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
    public static void helper(TreeNode root, int p, int q){
        if(root == null)    return;
        if(root.val == p)   count ++;
        if(root.val == q)   count ++;
        helper(root.left,p,q);
        helper(root.right,p,q);
    }
    public static void main(String[] args){
        Integer[] array = {3,5,1,6,2,0,8,null,null,7,4};
        TreeNode root = new TreeNode(array);
        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(1);
        System.out.println(lowestCommonAncestor(root, p,q).val);
    }
}
