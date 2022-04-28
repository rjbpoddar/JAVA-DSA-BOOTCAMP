import java.util.Scanner;

public class Large {
    // 5. Take 2 numbers as input and print the largest number.
public static void main(String[] args){
    Scanner in= new Scanner(System.in);
    System.out.println("Enter first input: ");
    int a= in.nextInt();
    System.out.println("Enter second number: ");
    int b= in.nextInt();
    // int max=0;
    if (a>b) {
        System.out.println("The largest no is: "+a );
    }
    else{
        System.out.println("The largest no is: "+b);
    }
    }
}
