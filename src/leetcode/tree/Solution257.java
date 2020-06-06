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
public class Solution257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();

        if (root == null) {
            return list;
        }
        if (root.left == null && root.right == null){
            list.add(root.val+"");
        }
        List<String> leftList = binaryTreePaths(root.left);
        List<String> rightList = binaryTreePaths(root.right);

        for (String s : leftList) {
            list.add(root.val+"->"+s);
        }
        for (String s : rightList) {
            list.add(root.val+"->"+s);
        }
        return list;
    }

}
