import java.util.Scanner;

public class Grade {
    public static void main(String[] args){
        // grade();
        System.out.println("Enter your marks: ");            
        Scanner in=new Scanner(System.in);
        int marks= in.nextInt();
        System.out.println(grade(marks));

        }

        static String grade(int marks){
        if(marks>90 && marks<=100){
            return "AA";
        }
        else if(marks>81 && marks<=90){
        return "AB";
        }
        else if(marks>71 && marks<=80){
        return "BB";
        }
        else if(marks>61 && marks<=70){
        return "BC";
        }
        else if(marks>51 && marks<=60){
        return "CC";
        }
        else if(marks<=50){
            // System.out.println("FAIL");
        return "fail";
        }
        else{
            return "okay";
        }
        }
}
