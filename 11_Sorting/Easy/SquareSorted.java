import java.util.Arrays;

public class SquareSorted {
    public static void main(String[] args) {
    int arr [] = {-4,-1,0,3,10};
        System.out.println((Arrays.toString(Sq(arr))));
        // ArrayList<Integer> nums = Sq(arr);//

    }
    static void insertion(int [] nums){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j >0; j++) {
            if (nums[j]<nums[j-1]) {
                swa(nums, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
    static void swa(int[]num,int first,int second){
        int temp = num[first];
        num[first] = num[second];
        num[second] = temp;
    }
    static int[] Sq(int [] arr){
    for (int i = 0; i < arr.length; i++) {
        arr[i]= arr[i]*arr[i];
        }
    insertion(arr);
    return arr;
    }
}
