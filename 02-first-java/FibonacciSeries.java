import java.util.Scanner;

// import java.util.Scanner;

public class FibonacciSeries {
    // 7. To calculate Fibonacci Series up to n numbers.

    public static void main(String[] args){
        System.out.println("|||||***********We are calculating Fibonacci Series**********|||||");
        Scanner in= new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = in.nextInt();
        int a =0;
        int b=1;
        int c;
        for (int i =1;i<=n; ++i) {
            System.out.print(a+ ", ");
            //compute the next term
            c=a+b;//c=NextTerm
            a=b;
            b=c;
                }
            }
     }
