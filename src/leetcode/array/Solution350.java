/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.array;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author kaili
 */
public class Solution350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        LinkedList list = new LinkedList();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                i ++;
            }else if(nums1[i] > nums2[j]){
                j ++;
            }else{
                list.add(nums1[i]);
                i ++;
                j ++;
            }
        }
        int[] res = new int[list.size()];
        for(int m = 0 ; m < res.length ; m ++)
            res[m] = (int)list.get(m);
        return res;
    }
}
