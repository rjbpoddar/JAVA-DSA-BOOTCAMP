import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
     int [] arr= {3,2,4,7,8,10};
     int target=18;   
     System.out.println(Arrays.toString(Summa(arr, target)));
    }
    static int [] Summa(int [] arr, int target){
        int i =0;
        while (i<arr.length) {
            if (arr[i]+arr[i+1]==target) {
                return new int[] {i,i+1};
            }
            else{
i++;
            }
        }
        return new int[]{};
    }
}
