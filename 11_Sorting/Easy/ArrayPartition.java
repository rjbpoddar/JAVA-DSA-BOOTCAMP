public class ArrayPartition {
    //- - [Array Partition I](https://leetcode.com/problems/array-partition-i/)
    public static void main(String[] args) {
    int [] arr = {6,2,6,5,1,2};
System.out.println(ArrayPart(arr));
    }
    static int ArrayPart(int [] arr ){
        insertion(arr);
        int sum =0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                sum= sum+arr[i+1];
            }else{
                sum=sum+arr[i];
            }
            i++;
        }
        return sum;
        }
    
     static void insertion(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (nums[j] < nums[j-1]) {
                    swap(nums, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
