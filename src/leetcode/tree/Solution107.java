/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author kaili
 */
public class Solution107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        helper(root,res,1);
        return res;
    }
    
    public void helper(TreeNode root,List<List<Integer>> list, int depth) {
        if(root == null)    return;
        
        if(list.size() < depth){
            List dplist = new ArrayList();
            list.add(0,dplist);
        }
        list.get(list.size() - depth).add(root.val);
        helper(root.left,list,depth + 1);
        helper(root.right,list,depth + 1);
    }
    
    
    public List<List<Integer>> levelOrderBottom2(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)    return res;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List list = new ArrayList();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
            res.add(0,list);
        }
        return res;
    }
    
}
