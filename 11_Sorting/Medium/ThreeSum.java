import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ThreeSum {
    public static void main(String[] args) {
    int[] nums = {-1,0,1,2,-1,4};
    List < List < Integer >> result = new ArrayList < > ();
    insertion(nums);
    for (int num1Idx = 0; num1Idx + 2 < nums.length; num1Idx++) {
        // Skip all duplicates from left
        // num1Idx>0 ensures this check is made only from 2nd element onwards  
        if (num1Idx > 0 && nums[num1Idx] == nums[num1Idx - 1]) {
            continue;
        }int num2Idx = num1Idx + 1;
        int num3Idx = nums.length - 1;
        while (num2Idx < num3Idx) {
            int sum = nums[num2Idx] + nums[num3Idx] + nums[num1Idx];
            if (sum == 0) {
                // Add triplet to result
                result.add(Arrays.asList(nums[num1Idx], nums[num2Idx], nums[num3Idx]));

                num3Idx--;

                // Skip all duplicates from right
                while (num2Idx < num3Idx && nums[num3Idx] == nums[num3Idx + 1]) num3Idx--;
            } else if (sum > 0) {
                // Decrement num3Idx to reduce sum value
                num3Idx--;
            } else {
                // Increment num2Idx to increase sum value
                num2Idx++;
            }
        }
    }
System.out.println(result);
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
//*******************BRUTE FORCE */
// public List < List < Integer >> threeSum(int[] nums) {
//     List < List < Integer >> result = new ArrayList < List < Integer >> ();

//     for (int i = 0; i < nums.length; i++) {
//         for (int j = i + 1; j < nums.length; j++) {
//             for (int k = j + 1; k < nums.length; k++) {
//                 if (nums[i] + nums[j] + nums[k] == 0) {
//                     List < Integer > triplet = new ArrayList < Integer > ();
//                     triplet.add(nums[i]);
//                     triplet.add(nums[j]);
//                     triplet.add(nums[k]);
//                     Collections.sort(triplet);
//                     result.add(triplet);
//                 }
//             }
//         }
//     }
//     result = new ArrayList < List < Integer >> (new LinkedHashSet < List < Integer >> (result));
//     return result;
// }
