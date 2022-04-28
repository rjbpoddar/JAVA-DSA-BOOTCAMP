import java.util.Scanner;

public class Product {
    public static void main(String[] args){
        System.out.println("Enter the variables: ");
        Scanner x = new Scanner(System.in);
        int a=x.nextInt();
        int b=x.nextInt();
        System.out.println(gun(a, b));
        }
        static int gun(int a, int b){
          int gun=a*b;
            return gun;
        }
}
