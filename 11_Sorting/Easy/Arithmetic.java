public class Arithmetic {
    public static void main(String[] args) {
    int [] nums = {5,1,3};
System.out.println(Arith(nums));
    }
    static boolean Arith(int [] nums){
        insertion(nums);
        int diff = nums[1]-nums[0];
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i+1]-nums[i]!=diff) {
                return false;
            }
        }
        return true;
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
    } static void swap(int[] num, int first, int second) {
        int temp = num[first];
        num[first] = num[second];
        num[second] = temp;
    }
}
