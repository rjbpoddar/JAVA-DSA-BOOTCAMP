public class OddOnly {
    public static void main(String[] args){
        // System.out.println();
        Odd();
        }
        static void Odd(){
            int i=0;
            do{
                i++;
                if(i%2==0){
                    continue;
                }
                System.out.println(i);
            }while(i<30);
        }
}
