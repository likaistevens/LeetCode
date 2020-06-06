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
public class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        if(root == null)    return res;

        
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List list = new ArrayList();
            for(int i = 0; i < size; i++){
                TreeNode temp = queue.poll();
                list.add(temp.val);
                if(temp.left != null)
                    queue.add(temp.left);
                if(temp.right != null)
                    queue.add(temp.right);
            }
            res.add(list);
        }
        return res;
    }
}
