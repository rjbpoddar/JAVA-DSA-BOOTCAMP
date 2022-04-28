import java.util.Arrays;
//- [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/)
public class SearchIn2dArrays {
    public static void main(String[] args) {
    int [][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,6}};
    int  target = 13;
System.out.println(Arrays.toString(Search(matrix, target))) ;
    }
    static int[] Search(int [][] matrix, int target){
    int row = 0;
    int col= matrix.length-1;
    while (row<matrix.length && col>=0) {
        if (matrix[row][col] == target) {
            return new int[]{row,col};
        }
        if (matrix[row][col]<target) {
            row++;
        }
        else{
            row--;
        }}
        return new int []{-1,-1};
    }
}
