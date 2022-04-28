import java.util.Arrays;
// - [Sort Array By Parity](https://leetcode.com/problems/sort-array-by-parity/)
public class SortByParity {
    public static void main(String[] args) {
    int [] nums ={3,1,2,4};
        System.out.println(Arrays.toString(Parity(nums)));
    }
    static int [] Parity(int [] nums){
        insertion(nums);
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
    
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if (nums[start] % 2 != 0) {
                int temp = nums[end];
                nums[end] = nums[start];
                nums[start] = temp;
                end--;
                continue;
            }
            start++;
        }
        return nums;        }
    
    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
