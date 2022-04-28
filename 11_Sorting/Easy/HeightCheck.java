// import java.util.Arrays;

public class HeightCheck {
    //- [Height Checker](https://leetcode.com/problems/height-checker/)  
public static void main(String[] args) {
    int [] arr = {1,2,3,9,5};
System.out.println(Height(arr));

}
    static int Height(int [] arr){
        int count =0;
        int [] height = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            height[i]=arr[i];
        }
        insertion(height);
        for (int i = 0; i < arr.length; i++) {
        if (height[i]==arr[i]) {
            continue;
        }
        else{
            count++;
        }
        }
    return count;
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
    static void swap(int[] arr1, int first, int second) {
        int temp = arr1[first];
        arr1[first] = arr1[second];
        arr1[second] = temp;
    }
}
