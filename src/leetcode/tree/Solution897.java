/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author kaili
 */
public class Solution897 {        
    Queue array = new LinkedList();
    public TreeNode increasingBST(TreeNode root) {
        inOrder(root);
        for(Object o : array)
            System.out.print(o+" ");
        System.out.println(array.size());
        TreeNode res = new TreeNode((int)array.poll());
        TreeNode cur = res;
        while(!array.isEmpty()){
            cur.right = new TreeNode((int)array.poll());
            cur = cur.right;
        }
        return res;    
    }
    private void inOrder(TreeNode node){
        if(node == null)
            return;

        inOrder(node.left);
        array.add(node.val);
        inOrder(node.right);
    }
    
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        TreeNode tree = new TreeNode(array);
        
        System.out.println(tree.right.right);
    }
}
