import java.util.Arrays;
//21. [Two Sum](https://leetcode.com/problems/two-sum/)
public class TwoSumArray {
   public static void main(String[] args){
    System.out.println();
    int []arr ={2,71,7,15};
    int target = 9;
    System.out.println(Arrays.toString(sum(arr, target) ));
       }
       static int[] sum(int [] arr, int target){
          int[] ans = new int[2];  
          int [] n = {-1,-1};
          for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == target - arr[i]) {
                    ans [0] = i;
                    ans [1]= j;
                    return ans;
                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
       }
}
