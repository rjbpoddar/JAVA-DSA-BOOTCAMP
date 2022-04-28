import java.util.Scanner;

public class armstrong {
    // 9. To find Armstrong Number between two given number.

    public static void main(String[] args){
        System.out.println("Enter two numbers: ");
        Scanner c=new Scanner(System.in);
        int num1=c.nextInt();
        int num2=c.nextInt();
        for (int i = num1; i<num2; i++){
            int check, rem, sum = 0;
            check = i;
            while(check != 0) {
               rem = check % 10;
               sum = sum + (rem * rem * rem);
               check = check / 10;
            }
            if(sum == i){
               System.out.println(""+i+" is an Armstrong number.");
            }
            }        }
}
