import java.util.Scanner;
// 1. Write a program to print whether a number is even or odd, also take input.
public class OddEven {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a= in.nextInt();
        if(a%2==1){
            System.out.println("It is a Odd number");
    }

        else{
            System.out.println("This is a Even number");
        }
}
    }