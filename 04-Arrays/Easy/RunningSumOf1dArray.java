import java.util.Arrays;
public class RunningSumOf1dArray {
    // 3. [Running Sum of  1d Array](https://leetcode.com/problems/running-sum-of-1d-array/)
public static void main(String[] args){
    int [] arr = {1,2,3,4};
    int sum [] = new int [arr.length];
    int temp =0;
    for(int i = 0; i<arr.length; i++){
        temp = arr[i]+temp;
        sum [i] =temp;
        }
        System.out.println(Arrays.toString(sum));
    }
   }