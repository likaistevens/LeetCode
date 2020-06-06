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
public class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List res = new ArrayList();
        
        inorder(root,res);
        return res;
    }
    
    public void inorder(TreeNode root, List res){
        if(root == null)    return;
        
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }
}
