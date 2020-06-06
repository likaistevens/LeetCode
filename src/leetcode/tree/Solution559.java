package leetcode.tree;

import java.util.Arrays;
import java.util.List;

public class Solution559 {
    public int maxDepth(Node root) {
        if(root == null) return 0;
       
        if(root.children.size() == 0) return 1;
        
        int[] temp = new int[root.children.size()];
        for(int i = 0 ; i < root.children.size(); i ++){
            temp[i] = 1+maxDepth(root.children.get(i));
        }
        Arrays.sort(temp);
        
        return temp[temp.length-1];
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};