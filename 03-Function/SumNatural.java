import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args){
        System.out.print("Enter the number till you want to find the sum: ");
        Scanner in= new Scanner(System.in);
        int a= in.nextInt();
        sum(a);
        }
        static void sum(int a){
            int sum=0;
            for (int i = 1; i <=a; ++i) {
                sum=sum+i;
            }
            System.out.println(sum);
        }
}
