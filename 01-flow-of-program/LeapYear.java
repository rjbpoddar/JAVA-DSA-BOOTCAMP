import java.util.Scanner;

public class LeapYear
{
    // Input a year and find whether it is a leap year or not.
public static void main(String[] args){
    System.out.print("Enter the year: ");
    Scanner in = new Scanner (System.in);
    int LeapYear = in.nextInt();
    if (LeapYear%4==0 || LeapYear%400==0){
    System.out.println("This is the LeapYear.");
    }
    else{
        System.out.println("This is not an LeapYear.");
    }
    
    }
}