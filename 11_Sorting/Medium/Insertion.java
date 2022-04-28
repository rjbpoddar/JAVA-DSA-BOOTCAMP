import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int [] arr = {4,2,1,3};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
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
