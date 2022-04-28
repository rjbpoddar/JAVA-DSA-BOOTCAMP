public class AssignCookies{
    //- [Assign Cookies](https://leetcode.com/problems/assign-cookies/)
    public static void main(String[] args) {
        int [] g = {1,2,3};
        int [] s = {1,1};
        System.out.println(Assigne(g, s));
    }
    static int Assigne(int [] g, int [] s){
        Sort(g);
        Sort(s);
    int i =0;
    int j =0;
    while (i<g.length && j < s.length) {
        if (g[i]<=s[j]) {
            i++;
            j++;
        }
        else{
            j++;
        }
    }
    return i;
    }
    static void Sort(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j++) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
     static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}