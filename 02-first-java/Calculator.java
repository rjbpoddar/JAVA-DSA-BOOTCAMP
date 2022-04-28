import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // 4. Take in two numbers and an operator (+, -, *, /) and calculate the
        // value.(Use if conditions)
        System.out.println("Hello welcome to the program");
        Scanner in = new Scanner(System.in);
        int ans=0;
        System.out.println("Enter first number: ");
        int a = in.nextInt();
        System.out.println("Enter the operator: ");
        char op = in.next().charAt(0);
        // System.out.println("Enter second number: ");
        //     int b = in.nextInt();
        if (op == '+' || op == '-' || op == '*' || op == '/') {
            System.out.println("Enter second number: ");
            int b = in.nextInt();
        
        if (op =='+'){
            ans=a+b;
            // System.out.println(ans);
        }
        
        if (op=='-'){
            ans=a-b;
            // System.out.println(ans);
        }
        if (op=='*'){
            ans=a*b;
        }    
        if (op=='/'){
            ans=a/b;
        }
        
        System.out.println(ans);
        }
    }
}
