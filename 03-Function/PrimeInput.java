import java.util.Scanner;
public class PrimeInput{
    public static void main(String[]args){
        prime();
    }
    static void prime(){
        System.out.println("Enter a no.");
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int count=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
            count++;}}

            if(count==2){
                System.out.println("The no. is prime");}
            else {
                System.out.println("The no. is not prime");} 
            }
            }    
