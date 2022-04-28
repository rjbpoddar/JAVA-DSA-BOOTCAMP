import java.util.Scanner;
//[A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.]
public class Voting {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        
        vote();
    }

    static void vote() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
            if(a>=18 ){
                System.out.println("you can vote.");
            }
            else{
                System.out.println("You are not able to vote. ");
            }
    }
}
