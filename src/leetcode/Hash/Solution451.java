package leetcode.Hash;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 *
 * @author kaili
 */
public class Solution451 {

    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap();
        HashMap<Integer, LinkedList<Character>> table = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        for (char c : map.keySet()) {
            System.out.println(c);
            if (table.get(map.get(c)) == null) {
                LinkedList<Character> list = new LinkedList<>();
                list.add(c);
                table.put(map.get(c), list);
            } else {
                table.get(map.get(c)).add(c);
            }
        }
        for (int i : table.keySet()) {
            pq.add(0 - i);
        }
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            int count = 0 - pq.peek();
            for (char t : table.get(count)) {
                for (int i = 0; i < count; i++) {
                    sb.append(t);
                }
            }
            pq.poll();
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "cccaaa";
        System.out.println(frequencySort(s));
    }

    
    // 大顶堆
    public String frequencySort2(String s) {
        //初始化字母数组
        int[] latters = new int[256];
        //填充数组
        for (char c : s.toCharArray()) {
            latters[c]++;
        }
        //排序
        PriorityQueue<Latter> queue = new PriorityQueue<>();

        for (int i = 0; i < latters.length; i++) {
            if (latters[i] != 0) {
                queue.add(new Latter((char) i, latters[i]));
            }
        }
        StringBuilder stringBuilder = new StringBuilder();

        while (!queue.isEmpty()) {
            Latter latter = queue.poll();
            for (int i = 0; i < latter.count; i++) {
                stringBuilder.append(latter.latter);
            }
        }

        return stringBuilder.toString();
    }

    public class Latter implements Comparable<Latter> {

        public char latter = '0';
        public int count = 0;

        public Latter(char latter, int count) {
            this.latter = latter;
            this.count = count;
        }

        @Override
        public int compareTo(Latter o) {
            return o.count - this.count;
        }
    }

}
