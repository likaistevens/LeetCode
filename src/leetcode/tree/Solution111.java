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
public class Solution111 {
    public int minDepth(TreeNode root) {
        // 节点为空 返回0
        if (root == null)   return 0;
        // 两个孩子都为空 。返回1
        if (root.right == null && root.left == null)    return 1;
        
        int right = minDepth(root.right);
        int left = minDepth(root.left);
        // 两个孩子有一个为空 说明没有到达叶子结点。 当前高度必须是左或右孩子中高度最大的那一个 加 1 。  right和left有一个为0，所以 可以用right+left+1表示
        if (root.right == null || root.left == null) {
            return right + left + 1;
        }
        // 两个孩子都不为空 。返回两个孩子最小深度 + 1即可
        return Math.min(left, right) + 1;
    }
}
