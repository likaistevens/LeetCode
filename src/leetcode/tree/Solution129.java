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
public class Solution129 {
    public int sumNumbers(TreeNode root) {
        return helper(root).get(0);
    }
    
    public static List<Integer> helper(TreeNode root){
        // {sum , depth}
        List<Integer> res = new ArrayList<>();
        if(root == null) {
            res.add(0);
            return res;
        }
        if(root.left == null && root.right == null){
            res.add(root.val);
            res.add(1);
            return res;
        }
        List<Integer> left = helper(root.left);
        List<Integer> right = helper(root.right);

        int sum = 0;
        sum += left.get(0);
        sum += right.get(0);

        for(int i = 1; i < left.size(); i++){
            res.add(left.get(i) + 1);
            sum += root.val * (int)Math.pow(10, left.get(i));
        }
        for(int i = 1; i < right.size(); i++){
            res.add(right.get(i) + 1);
            sum += root.val * (int)Math.pow(10, right.get(i));
        }
        res.add(0,sum);
        return res;
    }
    
    
    
    int sum=0;
    public int sumNumbers2(TreeNode root) {
        path(root,0);
        return sum;
    }
    void path(TreeNode root,int cur){
        if(root==null) return;
        cur=cur*10+root.val;
        if(root.left==null&&root.right==null){
            sum+=cur;
        }
        path(root.left,cur);
        path(root.right,cur);
        
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = null;
        System.out.println(helper(root));
    }
}
