import java.util.*;
public class First {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // System.out.print("Enter a no. : ");
    // int n = in.nextInt();
    int n;
  
    Pattern33(5);
    static void Pattern33(int n) {
        //for smaller case letter
        for (int i = 'a'; i <'z'; i++) {
            for (int j = 1; j <= i; j++) {
                
            }
        }
    }
    static void Pattern32(int n) {
    for (int i = n; i>=1; i--) {
    // int p ='E';
        for (int j = i; j<=n;j++) {
            System.out.print((char)('A'+j-1) +" ");
        }
        System.out.println();
    }
    }
    static void Pattern31(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
    static void Pattern30(int n) {
        int c =1;
    for (int i = 1; i <=n; i++) {
        for (int s = 1; s <= n-i; s++) {
            System.out.print(" ");  
        }
        for (int j = i; j >=1; j--) {
            System.out.print(j);
        }
        for (int j = 2; j <=i; j++) {
            System.out.print(j);
        }
        System.out.println();
    }
    }
static void Pattern29(int n) {
 for (int i = 1; i <n; i++) {
    for (int j = 1; j <=i; j++) {
        System.out.print("*");
    }
    for (int s = 1; s <= 2*(n-i); s++) {
        System.out.print(" ");
    }
    for (int j = 1; j <=i ; j++) {
        System.out.print("*");
    }
    System.out.println();
}
for (int i = n; i >=1; i--) {
    for (int j = 1; j <=i; j++) {
        System.out.print("*");
    }
    for (int s = 1; s <= 2*(n-i); s++) {
        System.out.print(" ");
    }
    for (int j = 1; j <=i ; j++) {
        System.out.print("*");
    }
    System.out.println();
}
    }
    static void Pattern28(int n) {
        for (int i = 1; i <=n;i++) {
        for(int s = 1 ; s<= n-i;s++){
            System.out.print(" ");
        }
        for (int j = 1; j <=i; j++) {
            System.out.print("* ");
        }
        System.out.println();
        }for (int i = n-1; i >=1;i--) {
            for(int s = 1 ; s<= n-i;s++){
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            }
    }
    static void Pattern27(int n) {
        int c =1, d=11;
        for (int row = n; row >=1; row--) {
            //spaces
            for (int space = 1; space <=n-row; space++) {
                System.out.print(" ");
            }
            //starts
            for (int col = 1; col <= row ;col++) {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
    static void Pattern26(int n) {
    for (int i = 1; i <=n; i++) {
    for (int j = 1; j <=n-i+1;j++) {
        System.out.print(+i);
    }
    System.out.println();    
    }
    }
    static void Pattern25(int n) {
    for (int i = 1; i <=n; i++) {
        for (int s = 1; s<= n-i; s++) {
            System.out.print(" ");
        }
        for (int j = 1; j <=n; j++) {
            if (i==1||i==n||j==1||j==n) {
                System.out.print("*");                
            }
            else{
            System.out.print(" ");
        }
    }System.out.println();
    }
    }
    static void Pattern24(int n) {
    for (int i = 1; i <= n; i++) {
       for (int j = 1; j <= 2*n; j++) {
           if (j==1|| j-i==0|| j==2*n|| i+j==11) {
               System.out.print("*");
           }
           else{
               System.out.print(" ");
           }
       }
       
        System.out.println();
    }    
    for (int i = n; i >=1; i--) {
        for (int j = 1; j <= 2*n; j++) {
            if (j==1|| j-i==0|| j==2*n|| i+j==11) {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        
         System.out.println();
     }    
    }


    static void Pattern22(int n) {
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <= i; j++) {
            if ((i+j)%2==0) {
                System.out.print("1 ");
            }
            else{
                System.out.print("0 ");
            }
        }
        System.out.println();
    }
    }
    static void Pattern21(int n) {
        int c =1;
    for (int row = 1; row <= n; row++) {
        
        for(int j =1; j<=row;j++ ){
System.out.print(c+" ");
c++;
        }
        System.out.println();
    }
    }
    static void Pattern19(int n) {
    for (int i = 1; i <=n; i++){
        for (int j = 1; j <=i; j++) {
            System.out.print("*");
        }
    for (int s = 1; s <= 2*(n-i); s++) {
        System.out.print(" ");
    }
    for (int j = 1; j <=i; j++) {
        System.out.print("*");
    }
    System.out.println();
    }
    for (int i = n-1; i >=1; i--){
        for (int j = 1; j <=i; j++) {
            System.out.print("*");
        }
    for (int s = 1; s <= 2*(n-i); s++) {
        System.out.print(" ");
    }
    for (int j = 1; j <=i; j++) {
        System.out.print("*");
    }
    System.out.println();
    }
}

    static void Pattern18(int n) {
        for (int i = n; i >=1; i--) {
            for(int j =1 ; j<=i;j++){
                System.out.print("*");
            }
            for(int s = 1; s<=2*(n-i);s++){
                System.out.print(" ");
                }
            for (int col= 1; col<=i; col++) {
                System.out.print("*");
            }
            System.out.println();
        }    
    for (int i = 1; i <= n; i++) {
        for(int j =1 ; j<=i;j++){
            System.out.print("*");
        }
        for(int s = 1; s<=2*(n-i);s++){
            System.out.print(" ");
            }
        for (int col= 1; col<=i; col++) {
            System.out.print("*");
        }
        System.out.println();
    }    
    
    }

    static void Pattern17(int n) {
    for (int row = 1; row <=n ; row++) {
    for (int space = 1; space <= n-row; space++) {
        System.out.print(" ");
    }
    for (int col = row; col >=1; col--) {
        System.out.print(col);
    }
    for (int cols = 2; cols<=row; cols++) {
        System.out.print(cols);
    }
    System.out.println();
    }
    }
    static void Pattern16(int n) {
        
        for (int row = 0; row < n; row++) {
        for (int space = 1; space < n-row; space++) {
            System.out.print(" ");
        }
        int number = 1;
        for(int col = 0; col <= row; col++){
           System.out.print(number+ " ");
            number= number*(row-col)/(col+1);
        }
        System.out.println();

        }
       
    }
    static void Pattern15(int n) {
        for (int i=1; i<= n ; i++)
        {
            for (int j = 1; j <=9; j++) {
            if (i+j ==6 || j-i ==4) {
                System.out.print("*");
            } 
            else{
                System.out.print(" ");
            }
            }
            System.out.println();
        }
        // for (int i=n-1; i>=1 ; i--)
        // {
        //     for (int j = 1; j <=9; j++) {
        //     if (i+j ==6 || j-i ==4) {
        //         System.out.print("*");
        //     } 
        //     else{
        //         System.out.print(" ");
        //     }
        //     }
        //     System.out.println();
        // }  
    }
    static void Pattern14(int n) {
        for (int i=n; i>=1 ; i--)
        {
            for (int j = 1; j <=9 ; j++) {
            if (i==n|| i+j ==6 || j-i ==4) {
                System.out.print("*");
            } 
            else{
                System.out.print(" ");
            }
            }
            System.out.println();
        }
    }
    static void Pattern13(int n) {
        for (int i=1; i<= n ; i++)
            {
                for (int j = 1; j <=9 ; j++) {
                if (i==n|| i+j ==6 || j-i ==4) {
                    System.out.print("*");
                } 
                else{
                    System.out.print(" ");
                }
                }
                System.out.println();
            }
    }
static void Pattern12(int n) {
        for (int row = n; row >=1; row--) {
            // Left spaces 
        for (int space = 1; space <= n-row; space++) {
            System.out.print(" ");
        }
        //stars
        for (int col = 1; col <= row; col++) {
            System.out.print("* ");
        }
        System.out.println();
        }
        for (int row = 1; row <=n; row++) {
            // Left spaces 
        for (int space = 1; space <= n-row; space++) {
            System.out.print(" ");
        }
        //stars
        for (int col = 1; col <=row; col++) {
            System.out.print("* ");
        }
        System.out.println();
        }
    }
    static void Pattern11(int n) {
        for (int row = n; row >=1; row--) {
            // Left spaces 
        for (int space = 1; space <= n-row; space++) {
            System.out.print(" ");
        }
        //stars
        for (int col = 1; col <= row; col++) {
            System.out.print("* ");
        
        }
        System.out.println();
        }
    }
    static void Pattern10(int n ){
        for (int row = 1; row <= n; row++) {
            // Left spaces
        for (int space = 1; space <= n-row; space++) {
            System.out.print(" ");
        }
        //stars
        for (int col = 1;col <= row;col++) {
            System.out.print("* ");
        }
        System.out.println();
        }
    }
    static void Pattern9(int n) {
        for (int row = n; row >=1; row--) {
            // Left spaces 
        for (int space = 1; space <= n-row; space++) {
            System.out.print(" ");
        }
        //stars
        for (int col = 1; col <= row; col++) {
            System.out.print("*");
        }
        for (int j = 2; j <= row; j++) {
            System.out.print("*");

        }
        System.out.println();
        }
    }
    static void Pattern8(int n ){
        for (int row = 1; row <= n; row++) {
            // Left spaces 
        for (int space = 1; space <= n-row; space++) {
            System.out.print(" ");
        }
        //stars
        for (int col = 1; col <= row; col++) {
            System.out.print("*");
        }
        for (int j = 2; j <= row; j++) {
            System.out.print("*");

        }
        System.out.println();
        }
    }
    static void Pattern7(int n) {
        for (int row = n; row >=1; row--) {
            //spaces
            for (int space = 1; space <=n-row; space++) {
                System.out.print(" ");
            }
            //starts
            for (int col = 1; col <= row ;col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern6(int n ){
for (int row = 1; row <=n; row++) {
    //spaces
    for (int space = 1; space <=n-row; space++) {
        System.out.print(" ");
    }
    //starts
    for (int col = 1; col <= row ;col++) {
        System.out.print("*");
    }
    System.out.println();
}
    }
    static void Pattern5(int n ){
        //upper half
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Lower half
        for (int row = n; row>=1; row--) {
            for (int col = 1; col <row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void Pattern4(int n ){
        for (int row = 1; row <=n; row++) {
        for (int col = 1; col <=row; col++) {
            System.out.print(col+" ");
    
        }
    
        System.out.println();
        
        }
        }
    static void Pattern3(int n ){
        for (int row = n; row >=1; row--) {
        for (int col = 1; col <=row; col++) {
            System.out.print("* ");
    
        }
    
        System.out.println();
        
        }
        }
    static void Pattern2(int n ){
        for (int row = 1; row <=n; row++) {
        for (int col = 1; col <=row; col++) {
            System.out.print("* ");
    
        }
    
        System.out.println();
        
        }
        }
    static void Pattern1(int n ){
    for (int row = 1; row <=n; row++) {
    for (int col = 1; col <=n; col++) {
        System.out.print("* ");

    }

    System.out.println();
    
    }
    }
}
