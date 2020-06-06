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
public class Solution113 {

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            System.out.println("==");
            return res;
        }
        if (root.val == sum && root.left == null && root.right == null) {
            List<Integer> temp = new ArrayList<>();
            temp.add(root.val);
            res.add(temp);
            return res;
        }
        List<List<Integer>> leftRes = pathSum(root.left, sum - root.val);
        List<List<Integer>> rightRes = pathSum(root.right, sum - root.val);

        for (List<Integer> li : leftRes) {
            System.out.println(li);
            li.add(0, root.val);
            res.add(li);
        }
        for (List<Integer> li : rightRes) {
                        System.out.println(li);

            li.add(0, root.val);
            res.add(li);
        }
        System.out.println(res);
        return res;
    }
    
    public static void main(String[] args){
        TreeNode root = new TreeNode(-2);
        root.left = null;
        root.right = new TreeNode(-3);
        pathSum(root, -5);
    }
}
