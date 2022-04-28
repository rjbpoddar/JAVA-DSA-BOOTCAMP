import java.util.Scanner;
public class ArmstrongFind1 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num = in.nextInt();
        int number, temp, total = 0;

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == num){
            System.out.println(num + " is an Armstrong number");
        }else{
            System.out.println(num + " is not an Armstrong number");
    }
}
}