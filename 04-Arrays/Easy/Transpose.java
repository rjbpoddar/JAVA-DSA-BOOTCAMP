import java.util.Arrays;

public class Transpose {
    public static void main(String[] args){
        // System.out.println();
        int [][] A={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(Trans(A)));
        }       
        static int[][] Trans(int [][] A){
         int n = A.length, C = A[0].length;
            int[][] ans = new int[C][n];
            for (int i = 0; i < n; ++i)
                for (int c = 0; c < C; ++c) {
                    ans[c][i] = A[i][c];
                }
            return ans;
        }
}
