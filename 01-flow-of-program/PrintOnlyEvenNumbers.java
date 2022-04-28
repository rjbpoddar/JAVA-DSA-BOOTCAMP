public class PrintOnlyEvenNumbers {
    public static void main(String[] args){
        EvenOnly();
        }
        static void EvenOnly(){
            int x=0;
            while(x<100){
                x++;
                if(x%2!=0)
                continue;
                System.out.println(x);
            }
        }
}