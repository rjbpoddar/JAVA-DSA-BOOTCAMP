import java.util.Scanner;

public class MaxMinArgue {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Hello");
        System.out.println("Enter three number: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("The maximum value is: "+max(a, b, c));
        System.out.println("the minimum value is: "+min(a, b, c));
        }
        static int max(int a,int b,int c) {
         int max=a;
            if (b>max) {
              max=b;
            }
            if(c>max){
                max=c;
            }
            return max;
        }
        static int min(int a,int b,int c) {
            int min = a;
            if(b<min){
                min = b;
            }
            if(c<min){
                min = c;
            }
            return min;
        }}
    // }