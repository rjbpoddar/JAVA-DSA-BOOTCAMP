import java.util.Arrays;
//8. [How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/)

public class SmallerThanCurrentNumber {
    public static void main(String[] args){
    int [] arr= {8,1,2,2,3};
    int [] res = new int [arr.length];
    for (int i = 0; i < arr.length; i++) {
        int num = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i]>arr[j] && j!=i) {
                num++;
            res[i]= num;
            }
        }
    }
    System.out.println(Arrays.toString(res));
    }
}
