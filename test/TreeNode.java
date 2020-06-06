/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import leetcode.tree.*;
import java.util.LinkedList;
import jdk.nashorn.api.tree.Tree;

public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
      TreeNode(int [] array) {
          TreeNode node = new TreeNode(array[0]); 
          for(int i : array){
              node.add(node, val);
          }
      }
      
      private TreeNode add(TreeNode node , int e){
        if(node == null) {
            return new TreeNode(e);
        }
        if(e < node.val)
            node.left = add(node.left , e);
        else if(e > node.val)
            node.right = add(node.right , e);

        return node;
    }
 }
