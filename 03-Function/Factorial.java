import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        System.out.println("Factorial is "+factorial(a));
        }
        static int factorial(int a){
            int fact=1;
            for(int i=1;i<=a;++i)
            fact =fact*i;//fact*=i;
            return fact;
        }
}
