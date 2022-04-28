public class HighestAltitude {
    public static void main(String[] args){
        // System.out.println();
        int [] gain = {-5,1,5,3,7,0,-7};
        System.out.println(Altitude(gain));// Altitude(gain);
        }
    static int Altitude(int [] gain){
    int sum = 0;int max = 0;
    for (int i = 0; i < gain.length; i++) {
        sum = sum+gain[i];
        if (sum>max){
            max = sum;
        }
    }
    return max;
    

    }
}
