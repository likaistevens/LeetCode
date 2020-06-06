package leetcode.test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import leetcode.test.TreeNode;


public class Solution {
    ArrayList<List<Integer>> list = new ArrayList();
    private void getTreenode() {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        list.add(l);
        for(List m : list)
            System.out.println(m+"--");
        l.remove(0);
        for(List m : list)
            System.out.println(m+"++");
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.getTreenode();
    }
}