
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import leetcode.tree.TreeNode;


public class Solution {
    boolean b = true;
    public boolean isUnivalTree(TreeNode root) {
        int value = root.val;
        getTreenode(root, b);
        return b;
    }

    private TreeNode getTreenode(TreeNode root, boolean b) {
        b = false;
        return root;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isUnivalTree(root));

    }
}