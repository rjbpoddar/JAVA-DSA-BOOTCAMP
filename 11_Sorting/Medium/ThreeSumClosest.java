public class ThreeSumClosest {
    public static void main(String[] args) {
        int []nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(Closes(nums, target));
    }
    static int Closes(int[] nums , int target){
    insertion(nums);   
    int res = nums[0]+nums[1]+nums[nums.length-1];
    for (int i = 0; i < nums.length-2; i++) {
        int a = i+1;
        int b = nums.length-1;
        while (a<b) {
        int sum = nums[i]+nums[a]+nums[b];
        if (sum>target) {
            b--;
        }
        else{
            a++;
        }
        if (Math.abs(sum-target)< Math.abs(res-target)) {
            res=sum;
        }
        }
    }
    return res;
    }
    static void insertion(int[] arrs){
        for (int i = 0; i < arrs.length-1; i++) {
            for (int j = i+1; j >0; j--) {
            if (arrs[j]<arrs[j-1]) {
                swap(arrs, j, j-1);
            }
            else{
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
