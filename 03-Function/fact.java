import java.util.Scanner;

public class fact {
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact*=i;
            System.out.println(fact);
        }
        }
}
