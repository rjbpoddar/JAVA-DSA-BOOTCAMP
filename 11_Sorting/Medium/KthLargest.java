public class KthLargest {
    public static void main(String[] args) {
    int [] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(Large(nums, k));
    }
    static int Large(int [] nums,int k){
    insertion(nums);
    return nums[nums.length-k];
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
    }static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
