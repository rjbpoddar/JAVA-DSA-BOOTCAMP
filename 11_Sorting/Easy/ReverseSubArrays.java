public class ReverseSubArrays {
    public static void main(String[] args) {
    int [] target = {1,2,3,4};
    int [] nums = {2,4,1,3};
        System.out.println(Sub(target, nums));
    }
    static boolean Sub(int [] target,int [] nums){
        insertion(nums);
        insertion(target);
    for (int i = 0; i < nums.length; i++) {
        if(nums[i] != target[i]) {
        return false;}
    }
    return true;
    }
    static void insertion(int[] arr){
    for (int i = 0; i < arr.length-1; i++) {
        for (int j = i+1; j > 0; j--) {
        if(arr[j]<arr[j-1]){
            swap(arr,j,j-1);
        }
        }
    }    
    }
    static void swap(int[]num, int first, int second) {
        int temp = num[first];
        num[first] = num[second];
        num[second] = temp;

    }
}
