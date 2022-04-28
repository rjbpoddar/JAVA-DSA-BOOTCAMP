import java.util.Scanner;
public class HcfAndLcm {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number: ");
        int a= in.nextInt();
        System.out.println("Enter second number: ");
        int b= in.nextInt();
        int hcf=0;
        for(int i = 1; i <= a || i <= b; i++) {
            if( a%i == 0 && b%i == 0 )
            hcf = i;
         }
         System.out.println("HCF of given two numbers is ::"+hcf);
        }
    }

