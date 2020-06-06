//给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
package leetcode.Queue_Stack;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Solution347 {
    //新建一个内部类，包含元素频率两个参数，优先队列中的元素必须可比较，所以这个类引入comparable接口
    private class Freq implements Comparable<Freq>{
            int e, freq;
            public Freq(int e, int freq){
                this.e = e;
                this.freq = freq;
            }

        @Override
        public int compareTo(Freq o) {
            return this.freq - o.freq;
        }
    }
    
    public List<Integer> topKFrequent(int[] nums, int k) {
        //新建一个map，储存所有元素和频率
        // number,frequence
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int num : nums){
            if(map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }
        //新建一个优先队列，
        PriorityQueue<Freq> pq = new PriorityQueue<>();
        //遍历map，队列元素小于k，直接入队，遇到频率比队首元素大的，就先出队一个，再入队。
        for(int num : map.keySet()){
            if(pq.size() < k)
                pq.add(new Freq(num,map.get(num)));
            else if(map.get(num) > pq.peek().freq){
                pq.remove();
                pq.add(new Freq(num,map.get(num)));
            }
        }
        LinkedList<Integer> list = new LinkedList<>();
        while(!pq.isEmpty()){
            list.add(pq.remove().e);
        }
        return list;
    }
}

class Solution347_2 {
    //新建一个内部类，包含元素频率两个参数，优先队列中的元素必须可比较，所以这个类引入comparable接口
    private class Freq{
            int e, freq;
            public Freq(int e, int freq){
                this.e = e;
                this.freq = freq;
            }
    }
    //此问题中Freq是我们自己定义的类，可以自己加入比较方法，可是对于java内置的类，无法修改，因此可以用这种在新建一个comparator的类的方法来比较
    private class FreqComparator implements Comparator<Freq>{
            @Override
            public int compare(Freq o1, Freq o2) {
                return o1.freq - o2.freq;
            }
    }
    
    public List<Integer> topKFrequent(int[] nums, int k) {
        //新建一个map，储存所有元素和频率
        // number,frequence
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int num : nums){
            if(map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }
        
        //新建一个优先队列，
        PriorityQueue<Freq> pq = new PriorityQueue<>();
//        由于comprator这个类，只在优先队列新建的时候使用一次，所以可以使用匿名内部类。
//        PriorityQueue<Freq> pq = new PriorityQueue<>(new Comparator<Freq>(){
//            @Override
//            public int compare(Freq o1, Freq o2) {
//                return o1.freq - o2.freq;
//            }
//        });
        
        //遍历map，队列元素小于k，直接入队，遇到频率比队首元素大的，就先出队一个，再入队。
        for(int num : map.keySet()){
            if(pq.size() < k)
                pq.add(new Freq(num,map.get(num)));
            else if(map.get(num) > pq.peek().freq){
                pq.remove();
                pq.add(new Freq(num,map.get(num)));
            }
        }
        LinkedList<Integer> list = new LinkedList<>();
        while(!pq.isEmpty()){
            list.add(pq.remove().e);
        }
        return list;
    }
}

class Solution347_3 {
    
    public List<Integer> topKFrequent(int[] nums, int k) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int num : nums){
            if(map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }
        
        //由于comprator这个类，只在优先队列新建的时候使用一次，所以可以使用匿名内部类。
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>(){
            //队列里不存freq类了，直接存integer，然后修改integer的默认比较方法，哪个integer在map对应的value大，就说这个integer大
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1) - map.get(o2);
            }
        });
        
        for(int num : map.keySet()){
            if(pq.size() < k)
                pq.add(num);
            else if(map.get(num) > map.get(pq.peek())){
                pq.remove();
                pq.add(num);
            }
        }
        LinkedList<Integer> list = new LinkedList<>();
        while(!pq.isEmpty()){
            list.add(pq.remove());
        }
        return list;
    }
}
