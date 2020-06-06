/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kaili
 */
public class Solution401 {
    static int[] nums = {1,2,4,8,10,20,40,80,160,320};
    static List<List<Integer>> all;
    public static List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();
        all = new ArrayList<>();
        back_track(nums, 0, num, 0, new ArrayList());
        for(List<Integer> l : all){
            String temp = "";
            int hour = 0;
            int min = 0;
            for(int i : l){
                if(i < 10){
                    hour += i;
                }else{
                    min += i/=10;
                }
            }
            if(hour > 11 || min > 59){
                continue;
            }
            temp += hour;
            temp += ":";
            if(min > 9){
                temp += min;
            }else{
                temp = temp + "0" + min;
            }
            res.add(temp);
        }
        return res;
    }
    static void back_track(int[] nums, int begin, int num, int index, List list){
        if(index == num){
            all.add(new ArrayList<>(list));
            return;
        }
        for(int i = begin; i < 10; i++){
            list.add(nums[i]);
            back_track(nums, i+1, num, index+1, list);
            list.remove(list.size() - 1);
        }
    }
    public static void main(String[] args){
        System.out.println(readBinaryWatch(1));
    }
}
