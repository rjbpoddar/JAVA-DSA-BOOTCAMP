import java.util.ArrayList;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
    int [] nums = {1,0,-1,0,-2,2};
     int target = 0;
    List<List<Integer>> Res= new ArrayList<>();
    insertion(nums);
    // INCOMPLETE DUE TO RECURSION
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
