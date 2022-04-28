import java.util.Scanner;

public class SumFunction {
    static void sum(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = in.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = in.nextInt();
        int sum=num1+num2;
        System.out.print("The sum of this two values is: "+sum);

    }
    public static void main(String[] args){
        sum();
        }
}
