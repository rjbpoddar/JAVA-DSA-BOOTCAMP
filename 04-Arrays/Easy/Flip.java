import java.util.Arrays;
import java.util.Scanner;
//13. [Flipping an Image](https://leetcode.com/problems/flipping-an-image/)
public class Flip{
   public static void main(String[] args){
     
System.out.println(Arrays.deepToString(FlipImage()));
}
static int[][] FlipImage(){
    int [] [] arr = { {1,1,0},
    {1,0,1},
    {0,0,0}};
    int C = arr[0].length;
        for (int[] row: arr)
            for (int i = 0; i < (C + 1) / 2; ++i) {
                int tmp = row[i] ^ 1;
                row[i] = row[C - 1 - i] ^ 1;
                row[C - 1 - i] = tmp;
            }

        return arr;
}
}