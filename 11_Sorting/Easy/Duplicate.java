import java.util.Arrays;

public class Duplicate {
    //- [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)
    public static void main(String[] args) {
    int [] nums =    {1,2,3,1};
    System.out.println(Dup(nums));
    
}
    static boolean Dup(int [] nums ){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j >0; j++) {
                if (nums[j]<nums[j-1]) {
                    swap(nums, j, j-1);
                }
                else{
                    break;
                }
            }
        }
        for(int index =1; index<nums.length;index++){
            if(nums[index-1] == nums[index]){
                return true;
            } else{
                return false;
            }
        }
        
}
static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
}
}