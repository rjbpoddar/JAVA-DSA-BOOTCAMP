import java.util.Scanner;

public class MultiplicationTable
{
public static void main(String[] args){
    //3. Take a number as input and print the multiplication table for it.  
    Scanner sc = new Scanner (System.in);

    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    for (int i=1;i<=10; i++) {
        System.out.println(num+ " * " +i+ " = " +num*i);
    }

    }
}