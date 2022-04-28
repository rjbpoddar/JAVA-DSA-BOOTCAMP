import java.util.Arrays;

import javax.sql.rowset.spi.SyncResolver;

public class LuckyNumber {
   public static void main(String[] args){
    //    System.out.println();
    int [] [] arr = {{3,7,8},{9,11,13},{15,16,17}};
    System.out.println(Arrays.toString(Luck(arr)));
}
    static int[] Luck(int [][] arr){
        int[] nu = {-1,-1};
        for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            int max = arr[0][0];
            if (arr[i][j]> max) {
               max = arr[i][j];                
            }
        }    
        }
        return nu;
    }

}
