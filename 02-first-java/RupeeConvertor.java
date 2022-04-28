import java.util.Scanner;

public class RupeeConvertor {
    // 6. Input currency in rupees and output in USD.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Indian Rupee: ");
        float a = in.nextFloat();
        double us = 74.19;
        double usd = a / us;
        System.out.println("The value in usd is: " + usd);
    }
}