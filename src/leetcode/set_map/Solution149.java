/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.set_map;

import java.util.HashMap;

/**
 *
 * @author kaili
 */
public class Solution149 {
    public int maxPoints(int[][] points) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = Integer.MIN_VALUE;
        for (int[] point : points) {
            for (int[] point1 : points) {
                int dis = distance(point, point1);
                if(!map.containsKey(dis)){
                    map.put(dis,1);
                }else{
                    map.put(dis,map.get(dis)+1);
                }
            }
            
            for(int k : map.keySet()){
                int count = map.get(k);
                res = Math.max(res, count+1);
            }
            map.clear();
        }
        return res;
    }
    
    
    
    private static int distance(int[] point1,int[] point2){
        return (point1[0] - point2[0])/(point1[1] - point2[1]);
    }
    
    public static void main(String[] args){
        float a = 1.0f/3.0f;
        double b = 1.0f/3.0f;
        System.out.println(a==b);
    }
}
