import java.util.Scanner;
public class GuessNumber {
    //- [Guess Number Higher or Lower](https://leetcode.com/problems/guess-number-higher-or-lower/)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = in.nextInt();//Scanner in = new Scanner(System.in);
        System.out.println("Enter the number you guessed : ");
        int x = in.nextInt();
        if (x<n) {
            System.out.println(-1);
        }
        else if(x>n){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
        System.out.println(GuessNum(n,x));
    }
    static int GuessNum(int n,int x){
        int low = 1;
        int high = x-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
           int res =  n;
            if (res == 0)
                return mid;
            else if (res ==-1){
                high = mid - 1;}
            else{
                low = mid + 1;
            }
        }
        return n;
    }
    }


