/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author kaili
 */
public class Solution145 {
    private class Commond{
        // true  遍历 ，false 输出
        boolean com;     
        TreeNode node;
        public Commond(boolean com, TreeNode node){
            this.com = com;
            this.node = node;
        }
    }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List res = new ArrayList();
        if(root == null)    return res;
        
        Stack<Commond> stack = new Stack<>();
        stack.push(new Commond(true,root));
        while(!stack.empty()){
            Commond c = stack.pop();
            if(!c.com){
                res.add(c.node.val);
            }else{
                if(c.node.right != null)
                    stack.push(new Commond(true,c.node.right));
                if(c.node.left != null)
                    stack.push(new Commond(true,c.node.left));
                stack.push(new Commond(false,c.node));
            }
        }
        return res;
    }
}
