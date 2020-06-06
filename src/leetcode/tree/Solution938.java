/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.tree;

/**
 *
 * @author kaili
 */
public class Solution938 {

    int sum = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }

        rangeSumBST(root.left, L, R);
        if (root.val > L && root.val < R) {
            sum += root.val;
        }
        rangeSumBST(root.right, L, R);
        return sum;
    }
    
    

}
