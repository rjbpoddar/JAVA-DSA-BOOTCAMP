import java.util.Arrays;
//5. [Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/)
public class ShuffleTheArray {
    public static void main(String[] args){
System.out.println(Arrays.toString(Shuffle()));
    }
    static int[] Shuffle(){
        int [] arr = {2,5,1,3,4,7};int n = 3;
    int [] ans = new int [2*n];
    for (int i = 0; i <n; i++) {
        ans[2*i] = arr[i];
            ans[2*i+1] = arr[n+i];
        }
        return ans;
    }
}
