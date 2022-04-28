import java.util.Scanner;

public class SumUsingreturn {
    static int sum2(){

       Scanner in=new Scanner(System.in);
        
        System.out.println("Enter First value: ");
        int a= in.nextInt();
        System.out.println("Enter second value: ");
        int b=in.nextInt();
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        int ans =sum2();
        System.out.println(ans);
    }
}
