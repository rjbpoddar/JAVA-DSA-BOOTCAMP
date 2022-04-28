import java.util.Scanner;

public class SI {
    // 3. Write a program to input principal, time, and rate (P, T, R) from the user and
   // find Simple Interest.
    public static void main(String[] args){
        System.out.println("********Welcome to SI calculator***********");
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the principal: ");
        int principal=in.nextInt();
        System.out.print("Enter the RateOfInterest for " +principal+ " price: ");
        int RateOfInterest=in.nextInt();
        System.out.print("Enter the Year: ");
        int Year=in.nextInt();
        int SimpleInterest=(principal*RateOfInterest*Year)/100;
        System.out.print("Now the simple interest is: "+SimpleInterest);
        }
}