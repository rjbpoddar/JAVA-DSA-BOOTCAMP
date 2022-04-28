import java.util.Scanner;

public class EvenOdd {
    // Define a program to find out whether a given number is even or odd.
    public static void main(String[] args){
        System.out.println("Hello");
        prog();
        }
        static void prog(){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter number to find out whether a given number is even or odd: ");
            int a= sc.nextInt();
            if (a%2!=0) {
                System.out.println("This is a odd number");
            }
            else{
                System.out.println("This is a even number");
            }
        }
}
