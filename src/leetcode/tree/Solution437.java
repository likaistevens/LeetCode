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
public class Solution437 {
    public int pathSum(TreeNode root, int sum) {
        if(root == null)    return 0;
        
        return findPath(root, sum) + pathSum(root.right, sum) + pathSum(root.left, sum);
    }
    // root 必须作为根节点
    public int findPath(TreeNode root, int sum){
        if(root == null)    return 0;
        int zero = 0;
        // 如果 root.val == sum   不应该返回，只能说现在有一个符合条件的了。   要继续往下看。  此时 往下都是找 和 为0的路线了。
        if(root.val == sum) 
            zero = 1;
        return zero + findPath(root.left, sum - root.val) + findPath(root.right, sum -root.val);
    }
}
