/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.array;

/**
 *
 * @author kaili
 */
public class mianshi51 {

    static int count = 0;
    
    public int reversePairs(int[] nums) {

    }

    // 递归调用，
    public static void Sort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        int mid = (r + l) / 2;
        Sort(arr, l, mid);
        Sort(arr, mid + 1, r);
        if (arr[mid] > arr[mid + 1]) {
            Merge(arr, l, mid, r);
        }
    }

    // 把数组arr[] 排好序的部分[l...mid]和[mid+1...r]合并
    public static void Merge(int[] arr, int l, int mid, int r) {
        int i = l;
        int j = mid + 1;
        int[] temp = new int[r - l + 1];

        for (int k = 0; k < temp.length; k++) {
            if (i > mid) {
                temp[k] = arr[j];
                j++;
            } else if (j > r) {
                temp[k] = arr[i];
                i++;
            } else if (arr[i] > arr[j]) {
                System.out.println("count ");
                /****----------------------------*****/
                count++;
                /****——--------------------------*****/
                temp[k] = arr[j];
                j++;
            } else {
                temp[k] = arr[i];
                i++;
            }
        }

        for (int k = 0; k < temp.length; k++) {
            arr[k + l] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,5,6,4};
        mianshi51.Sort(arr, 0, (arr.length - 1));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(' ');
        }
        System.out.println(count);
        System.out.println();
    }

}
