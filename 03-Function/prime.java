import java.util.Scanner;

public class prime {
    public static void main(String[] args){
        System.out.print("Enter a number you want to check for prime: ");
         
        // int m=0;
        // int sum=0;
        primeN();
        }
        static void primeN(){
            Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
            for (int i = 1; i <= n; i++) {
                if(n%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("This is a prime number");
            }
            else{
                System.out.println("This is Not a prime number");
            }
        }
}
