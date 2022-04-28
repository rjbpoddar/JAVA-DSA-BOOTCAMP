public class DiagonalSum {
    //<!-- 15. [Matrix Diagonal Sum](https://leetcode.com/problems/matrix-diagonal-sum/) -->
public static void main(String[] args){
   // System.out.println();
   int [] [] arr ={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
    int n = arr.length-1;
    int sum1 = 0;int sum2=0;
    for (int i = 0; i <=n ; i++) {
        sum1+= arr[i][i];
        sum2+= arr[i][n-i];
    }                     
    if ((n+1)%2==0) {
        System.out.println(sum1+sum2);
    }
    else{
        System.out.println((sum1+sum2)- arr[n/2][n/2]);
    }
}
}