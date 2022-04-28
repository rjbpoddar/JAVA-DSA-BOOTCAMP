import java.util.Arrays;

public class TwoSum {
//- [Two Sum II - Input array is sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)
    public static void main(String[] args) {
    int [] nums = {2,7,11,15};
    int target = 9;
        System.out.println(Arrays.toString(TwoSum(nums, target))    );
    }
    static int[] TwoSum(int [] nums, int target ){
        int start =0;
        int end = nums.length-1;
        int sum = nums[start]+nums[end];
        while (start<=end) {
            if (sum==target) {
                break;
            }
            else if(sum>target){
                end= end-1;
            }
            else{
                start = start+1;
            }
        }
        return new int[]{start+1,end+1};
    }
}