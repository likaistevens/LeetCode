
import leetcode.tree.Solution965;
import leetcode.tree.TreeNode;

class Solution {
    boolean b = true;
    public boolean isUnivalTree(TreeNode root) {
        int value = root.val;
        getTreenode(root, value, b);
        return b;
    }

    private TreeNode getTreenode(TreeNode root, int value, boolean b) {
//        if (root == null) {
//            return root;
//        }
//        if (root.val != value) {
//            System.out.println("修改了");
            b = false;
//            return null;
//        }
//        System.out.println(root.val);
//        getTreenode(root.left, value, b);
//        getTreenode(root.right, value, b);
        return root;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isUnivalTree(root));

    }
}