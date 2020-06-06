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
public class Solution103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        boolean b = true;  // true -->     false   <--
        if(root == null)    return res;
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List list = new ArrayList();
            for(int i = 0; i < size; i++){
                TreeNode temp = queue.poll();
                if(b){
                    list.add(temp.val);
                }else{
                    list.add(0,temp.val);
                }
                if(temp.left != null)  
                    queue.add(temp.left);
                if(temp.right != null)
                    queue.add(temp.right);
            }    
            b = !b;
            res.add(list);
        }
        return res;
    }
}
