import java.util.Scanner;

public class CircumphereanceSpehere {
    // [Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.]
        public static void main(String[] args){
            System.out.println("Enter the radius of the circle: ");
            Scanner sc= new Scanner(System.in);
            int a = sc.nextInt();
            System.out.println("The area of the circle is "+area(a));
            circ();
            }
            static double area(int a){
                double pi=3.14;
                double area=pi*a*a;
                return area;
            }
            static void circ(){ 
                Scanner sc= new Scanner(System.in);
                int r = sc.nextInt();
                double pi=3.14;
                double cir= pi*2*r;
                System.out.println("The circumphereance of the circle is "+cir);
            }
}
