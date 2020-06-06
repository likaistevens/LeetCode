/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.other;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author kaili
 */
public class Solution77 {
//    List<List<Integer>> res = new ArrayList<>();
//    boolean[] used;
//    public List<List<Integer>> combine(int n, int k) {
//        if(n < k)   
//            return res;
//        used = new boolean[n+1];
//        List<Integer> list = new ArrayList<>();
//        generate(n,k,1,0,list);
//        return res;
//    }
//    void generate(int n, int k, int start,int index, List list){
//        if(index == k){
//            System.out.println(list);
//            res.add(new ArrayList(list));
//        }
//        
//        for(int i = start; i < n+1; i++){
//            if(!used[i]){
//                list.add(i);
//                used[i] = true;
//                System.out.println(start  + "--");
//                generate(n,k,i + 1,index+1,list);
//                list.remove(list.size() - 1);
//                used[i] = false;
//            }
//        }
//        
//    }
    
    // 不需要used 。 
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        if(n < k)   
            return res;
        List<Integer> list = new ArrayList<>();
        generate(n,k,1,0,list);
        return res;
    }
    void generate(int n, int k, int start,int index, List list){
        if(index == k){
            res.add(new ArrayList(list));
            return;
        }
        // 剪枝    
        // 还有 k - c.size() 个空位，所以，[i...n] 中至少要有k-c.size()个元素
        // i最多为  n - (k-list.size())+1
        // 例如： 从10个里面选4个， 现在 我们已经进行到了list里面有两个，还需要选两个，那么i循环到9 就没必要继续循环了。最后两个就是9和10
        for(int i = start; i <= n - (k-list.size())+1 ; i++){
            list.add(i);
            generate(n,k,i + 1,index+1,list);
            list.remove(list.size() - 1);
        }
        
    }
    
    
    public static void main(String[] args){
        Solution77 s = new Solution77();
        int n = 4;
        int k = 2;
        List l1 = new ArrayList();
        l1.add(1);
        l1.add(2);
        List l2 = new ArrayList();       
        l2.add(2);
        l2.add(1);
        System.out.println(l1.equals(l2));
        System.out.println(s.combine(n,k));
    }
}
