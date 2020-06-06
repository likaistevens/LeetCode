//给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
//不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
//示例 1:
//给定数组 nums = [1,1,2], 
//函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。 
//你不需要考虑数组中超出新长度后面的元素。
package leetcode.array;

/**
 *
 * @author kaili
 */
public class Solution26{
    public int removeDuplicates(int[] nums) {
        int cur = 0 ;
        int next = 1;
        while(next < nums.length){
            if(nums[cur] == nums[next]){
                next += 1;
            }
            else{
                nums[cur + 1] = nums[next];
                next +=1;
                cur +=1;
            }
        }
        return cur + 1;
    }
}
