    static void mini(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1=in.nextInt();
        System.out.println("Enter Second number: ");
        int n2=in.nextInt();
        System.out.println("Enter third number: ");
        int n3=in.nextInt();
        int min;
        min=n1;
        if(n2<n3 && n2<n1){
            min=n2;
            System.out.println("Minimum value is: "+min);
        }
        if(n3<n1 && n3<n2){
            min=n3;
            System.out.println("Minimum value is: "+min);
        }
            else{
                System.out.println("Minimum value is: "+min);
            }
    }
     public static void main(String[] args){
        System.out.println("Hello ");

        maxi();
        mini();
        }
}
