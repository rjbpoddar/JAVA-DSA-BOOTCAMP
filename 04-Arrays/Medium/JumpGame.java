public class JumpGame {
    public static void main(String[] args) {
        int [] arr = {3,2,1,0,4};
       System.out.println(Jump(arr));
    }
    static boolean Jump(int[] arr ){
        int Max = arr.length-1;
        if (arr[0]==0) {
            return false;
        }
        for (int i = Max; i <=0; i--) {
            if (i+  arr[i]>=Max-1) {
                Max= i;
        }
    }
    return Max==0;
}
}
