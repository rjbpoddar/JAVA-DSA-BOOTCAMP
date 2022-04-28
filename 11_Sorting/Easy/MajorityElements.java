// import java.util.Arrays;
// - [Majority Element](https://leetcode.com/problems/majority-element/)
public class MajorityElements {
    public static void main(String[] args){
    int [] nums = {2,2,1,1,1,2,2,2,2,2,2};
// Major(nums);
System.out.println((Major(nums)));
    }
    static int Major(int [] nums){
    int i = 0;
    while (i<nums.length) {
        int correct = nums[i]-1;
        if (nums[i]!=nums[correct]) {
            swap(nums, i, correct);
        }
        else{
            i++;
        }
    }
    return nums[nums.length/2];
  
    }
    static void swap(int [] nums, int first, int second){
     int temp = nums[first];
     nums[first]= nums[second];
     nums[second]= temp; 
    }
}
