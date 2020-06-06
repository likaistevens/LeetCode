/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kaili
 */
public class Solution144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        
        preorder(root,res);
        return res;
    }
    
    public void preorder(TreeNode root,List res){
        if(root == null) return;
        
        res.add(root.val);
        System.out.println(root.val);
        preorder(root.left,res);

        preorder(root.right,res);
    }
}
