import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;;
public class SetMatrixZeroes {
    public static void main(String[] args) {
    int [] [] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> rows = new ArrayList<>();
        List<Integer> col = new ArrayList<>();
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j]==0) {
                rows.add(i);col.add(j);
            }
        }
    }
    for (int i = 0; i < rows.size(); i++) {
        for (int j = 0; j < n; j++) {
            matrix[rows.get(i)][j]= 0;
        }
    }
    for (int i = 0; i < col.size(); i++) {
        for (int j = 0; j < m; j++) {
            matrix[j][col.get(i)]=0;
        }
    }
    System.out.println(Arrays.deepToString(matrix));
    }
}
