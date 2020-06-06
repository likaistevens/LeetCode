/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.tree;

import java.util.ArrayList;

/**
 *
 * @author kaili
 */
public class Solution230 {
    ArrayList<Integer> list = new ArrayList<>();    

    public int kthSmallest(TreeNode root, int k) {
        helper(root);
        return list.get(k-1);
    }
    public void helper(TreeNode root){
        if(root == null)    return;
        helper(root.left);
        list.add(root.val);
        helper(root.right);
    }
}
