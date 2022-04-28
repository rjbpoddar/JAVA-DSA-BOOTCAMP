public class KthPositive{
//- [Kth Missing Positive Number](https://leetcode.com/problems/kth-missing-positive-number/)
public static void main(String[] args) {
   int []  arr = {2,3,4,7,11};int k = 5;
System.out.println(Pos(arr, k));
}
static int Pos(int[] arr, int k){
int left=0, right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]-mid-1<k)
                left=mid+1;
            else
                right=mid-1;
            
        }
        return k+left;
}
}