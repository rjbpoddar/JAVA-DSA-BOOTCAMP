public class LargestPremier {
    public static void main(String[] args) {
    int [] nums = {1,2,1};
        System.out.println(peri(nums));
    }
    static int peri(int [] nums){
    insertion(nums);
    for (int i = 0; i < nums.length; i++) {
        if (nums[i]<nums[i+1]+nums[i+2] && nums[i+1]<nums[i]+nums[i+2] && nums[i+2]<nums[i]+nums[i+1]) {
            return nums[i]+nums[i+1]+nums[i+2];
        }
        else{
            return -1;
        }
    }
    return 0;
    }//     *********another step************
    //for(int i=a.length - 1; i>1; i--){
//         if(a[i] < (a[i-1] + a[i- 2])){
//             return (a[i]+a[i - 1]+ a[i - 2]);
//        }
//   }
//   return 0;
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
