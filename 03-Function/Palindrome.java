import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        System.out.print("Enter the number: ");
        palindrome();
    }
    static void palindrome(){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int original=n;
            int ans =0;
            while (n>0) {
                int rem=n%10;
                ans=ans*10+rem;
                n=n/10;
                System.out.println(ans);
                if (original==ans) {
                    System.out.println("Palindrome");
                }
                else{
                    System.out.println("not palindrome");
                }
            }
        }
}
