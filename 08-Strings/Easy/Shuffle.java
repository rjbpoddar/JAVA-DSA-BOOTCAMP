public class Shuffle {
    public static void main(String[] args) {
        String s="codeleet"; int[] arr={4,5,6,7,0,2,1,3};
        System.out.println(Shuffl(s, arr));
    }
    static String Shuffl(String s, int [] arr){
        // char[] res = new char[arr.length];

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         if (arr[j] == i) {
        //             res[i] = s.charAt(j);
        //             break;
        //         }
        //     }
        // }
        // return String.valueOf(res);
        StringBuilder sb = new StringBuilder(s);
    
    for(int i = 0 ; i < arr.length ; i++)
    {
        sb.setCharAt(arr[i],s.charAt(i));
    }
    
    return sb.toString();
    }
}
