import java.util.Scanner;

public class Sum
{//Take two numbers and print the sum of both.
public static void main(String[] args){
    Scanner in = new Scanner (System.in);
    System.out.print("Enter your first Number: ");
    int num1 = in.nextInt();
    System.out.print("Enter your second Number: ");
    int num2 = in.nextInt();
    int sum = num1 + num2;
    System.out.print("The sum of the given numbers is: "+sum);

    }
}