import java.util.Arrays;
//2. [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/)
public class Concatenation{
    public static void main (String [] args ){
        int [] arr = {1,3,2,1};
        int n = arr.length;
        int [] ans = new int [2*n];
        for(int i =0;i<n; i++){
            ans[i]= arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            ans[n]= arr[i];
            n++;
        }
        System.out.println(Arrays.toString(ans));
    }
}