import java.util.Arrays;
// - [Sort Array By Parity II](https://leetcode.com/problems/sort-array-by-parity-ii/)
public class SortPArityTwo {
    public static void main(String[] args) {
    int [] arr = {3,2,4,1};
        System.out.println(Arrays.toString(ParityTwo(arr)));
    }
    static int[] ParityTwo(int[] arr){
    int j=1;
    for(int i=0;i<arr.length;i+=2){
        if(arr[i]%2!=0){
            while(arr[j]%2!=0)
                j+=2;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    return arr;
    }

}
