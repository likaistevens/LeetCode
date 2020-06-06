//给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
//不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
//元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
package leetcode.array;

public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;
        while(j < nums.length){
            if(nums[j] != val){
                nums[i] = nums[j];
                i ++;
            }
            j ++;
        }
        return i;
    }
}
//用快慢指针，慢指针存放以前的元素，快指针探索后面的新元素

