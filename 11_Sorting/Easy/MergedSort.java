import java.util.Arrays;
//- [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)
public class MergedSort {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,0,0,0};int[] arr2= {2,5,6};
        int m =3,n=3;
        int [] ans = new int[m+n];
      System.arraycopy(arr1, 0, ans, 0,m);
      System.arraycopy(arr2, 0, ans ,m, n);
      int [] arr = ans;
      bubble(arr);
      System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!swapped) { // !false = true
                break;
            }
        }
    }}
