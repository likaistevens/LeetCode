package leetcode.array;

/**
 *
 * @author kaili
 */

import java.util.*;

public class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[k];
    }
    
    public static int findKthLargest2(int[] nums, int k) {
        int r = nums.length - 1;
        int p = partition(nums,0,r);
        while(r - p != k - 1){
            if(r - p > k - 1)
                p = partition(nums,p+1,r);
            else
                p = partition(nums,0,p);
        }
        return nums[p];
    }

    private static int partition(int[] arr, int l, int r){
        swap(arr,(int)(Math.random()*(r-l+1))+l,l); 
        int p = arr[l];
        // j 右边第一个需要考察的元素
        int i = l + 1;
        int j = r;
        // i 当前考察的元素，从l+1开始
        while(true){
            while(i <= r && arr[i] < p )
                i ++;
            while(j >= l+1 && arr[j] > p)
                j --;
            if(i > j)
                break;
            swap(arr,i,j);
            i ++;
            j --;
        }
        swap(arr,l,j);
        return j;
    }
    
    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int[] arr = {3,3,3,3,4,3,3,3,3};
        //Solution215.sort(arr,0,9,2);
        //partition(arr,0,9);
        System.out.println(findKthLargest2(arr,5));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(' ');
        }
        System.out.println();
    }
}
