import java.util.Arrays;

public class Rank{
    public static void main(String[] args) {
    int [] nums ={40,10,20,30};
System.out.println(Arrays.toString(rank(nums)));
    }
    static int[]rank(int[] nums){
    insertion(nums);
     
    for (int i = 1; i < nums.length; i++) {
        nums[i-1]=i;
    //.    return i;
    }
    return nums;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
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
}