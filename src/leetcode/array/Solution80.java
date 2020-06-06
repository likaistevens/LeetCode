package leetcode.array;

/**
 *
 * @author kaili
 */
public class Solution80 {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n < 3)   return n;
        
        int cur = 0;
        int next = 1;
        int count = 1;
        int temp = nums[0];
        
        // cur 正确序列的最后一位
        // next 从头到尾遍历
        // temp 当前考察元素
        // count 靠next计数，当前考察元素的个数
        
        while(next < n){
            if(nums[next] == temp){
                if(count >= 2){
                    next ++;
                    continue;
                }
                nums[cur+1] = temp;
                count ++;
                cur ++;
            }
            else if(nums[next] != temp){
                temp = nums[next];
                count = 1;
                nums[cur+1] = temp;
                cur ++;
            }
            next ++;
        }
        return cur + 1;
    }
    
    
    public int removeDuplicates2(int[] nums) {
        int j = 1, count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= 2) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
    
    public static void test(){
        int n = 0;
        while(n < 10){
            if(n<5){
                if(n<3){
                    n ++;
                    continue;
                }
                System.out.println("第一个if");
            }
            else{
               
                System.out.println("else执行");
            }
            n ++;
            System.out.println( " n ++");
        }
    }
    
    public static void main(String[] args){
        int[] nums = {1,1,1,2,2,3};
        removeDuplicates(nums);
        for(int i : nums)
            System.out.print(i+" ");
    }
}
