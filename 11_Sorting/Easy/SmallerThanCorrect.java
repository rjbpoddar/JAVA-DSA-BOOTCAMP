import java.util.Arrays;

public class SmallerThanCorrect{
    public static void main(String[] args) {
    int[] arr = {8,1,2,2,3};
    System.out.println(Arrays.toString(Small(arr)));
    }
    static int [] Small(int[] arr){
        int[] ans = new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count =0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]>arr[j]&&j!=i) {
                    count++;
                }
                ans[i]=count;
            }
        }
        return ans;
    }
}