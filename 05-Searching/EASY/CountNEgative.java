public class CountNEgative {
// [Count Negative Numbers in a Sorted Matrix](https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/)
    public static void main(String[] args) {
    int [][] arr =  {{4,3,2,-1},
                    {3,2,1,-1},
                    {1,1,-1,-2},
                    {-1,-1,-2,-3}};
        System.out.println(Negative(arr));
    }
    // ***********************USING BINARY SEARCH****************
    static int Negative(int [][] arr){
        int row = 0;
        int col = arr[0].length-1;
        int count = 0;
        while (row < arr.length && col >=0)     //we dont want to go out of bound
        {
        if(arr[row][col] < 0)                 //if number is negative
        {
         count = count + (arr.length - row);  //if a number is negative than all the number
         col--;                                //below it will be negative coz if sorting
        }                                      //col-- to remove checked column
            
        else  row++;                           //if number is positive
                                               //increment row beacuse we can find negative
        }                                      //numbers below positive numbers
        
        return count;
        }
 
    //      **************************USING NORMAL BRUTEFORCE***********
    // static int Negative(int [][] arr){
    //     int output = 0;   
    //     for(int i = 0;i<arr.length;i++) {
    //         for(int j = 0;j<arr[0].length;j++) {
    //             if(arr[i][j]<0)
    //                 output++;
    //         }
    //     }
    //     return output;
        
    // }
}
