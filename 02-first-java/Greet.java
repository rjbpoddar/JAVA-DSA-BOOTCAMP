import java.util.Scanner;

public class Greet {
    // 2. Take name as input and print a greeting message for that name.
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner in = new Scanner(System.in);
        String name= in.next();
        System.out.println("welcome "+name);
    }
}
