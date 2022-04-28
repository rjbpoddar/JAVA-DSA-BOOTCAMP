public class CheckDouble{
    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        System.out.println(Checking(arr)    );
    }
    static boolean Checking(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==(arr[j]*2) && i!=j){
                    return true;
                }
            }
        }
        return false;
            } 
    }