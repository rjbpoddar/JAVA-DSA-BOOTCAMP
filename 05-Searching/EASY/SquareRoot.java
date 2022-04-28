import java.util.Scanner;
//- [Square Root](https://leetcode.com/problems/sqrtx/)
public class SquareRoot{
    public static void main(String[] args) {
        int x = 36;
        System.out.println(SquareRoo(x));
    }
    static int SquareRoo(int x){
        int start = 0;
        int end =  x;
        int ans = 0;
        while (start<= end) {
            int mid = start+(end-start)/2;
            int square = mid*mid;
            if(mid*mid == x) {
                return (int)mid;
            }
            else if(mid*mid < x) {
                ans = (int)mid;
                start = (int)mid+1;
            }
            else {
                end = (int)mid-1;
            }
        }
        return ans;
    }
}