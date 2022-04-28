public class ValidPerfectSquare {
    // - [Valid Perfect Square](https://leetcode.com/problems/valid-perfect-square/)
    public static void main(String[] args) {
    int num = 16;
    System.out.println(Perfect(num));// Perfect(num);
    }
    static boolean Perfect(int num){
    int start = 1;
    int end = num/2;
    while (start<=end){
    int mid = start + (end-start)/2;
    if (mid*mid==num) {
        return true;
    }
    else if(mid*mid <num){
            start = mid+1;}
        else{
            end =mid-1;
    }  
}    
return false;
    }

}
