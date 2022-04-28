import java.util.ArrayList;
import java.util.List;
//    //1. [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)
public class Spiral {
    public static void main(String[] args) {
        int [] []matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> res = new ArrayList<>(); 
        if(matrix.length ==0 ){
            System.out.print(res);
                }
            int rowStart =0;int rowEnd= matrix.length-1;int colBegin = 0; int colEnd = matrix[0].length -1;
            while(rowStart <= rowEnd && colBegin<= colEnd){
                for (int i = colBegin; i <=colEnd; i++) {
                    res.add(matrix[rowStart][i]);
                }rowStart++;
                for (int i = rowStart; i <=rowEnd; i++) {
                    res.add(matrix[i][colEnd]);
                }colEnd--;
                if (rowStart<= rowEnd) {
                    for (int i = colEnd; i >= colBegin; i--) {
                        res.add(matrix[rowEnd][i]);
                    }
                }rowEnd--;
                if (colBegin <= colEnd) {
                    for (int i = rowEnd; i >=  rowStart; i--) {
                        res.add(matrix[i][colBegin]);
                    }
                }colBegin++;
    } 
    System.out.println(res);
}
}