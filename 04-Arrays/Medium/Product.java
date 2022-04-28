import java.util.Arrays;

public class Product {
    //3. [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/)
public static void main(String[] args) {
   int [] nums = {1,2,3,4};
   int [] ans= new int [nums.length];
   ans[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            ans[i] = nums[i-1] * ans[i-1];
        }
        
        int R = 1;
        for(int i=nums.length-1; i>=0; i--) {
            ans[i] *= R;
            R *= nums[i];
        }      
        System.out.println(Arrays.toString(ans));
}
}
