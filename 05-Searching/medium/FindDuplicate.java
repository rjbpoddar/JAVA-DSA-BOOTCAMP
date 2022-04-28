import java.util.Arrays;
//<!-- - [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/) -->
public class FindDuplicate {
    public static void main(String[] args) {
        int [] arr = {1,3,4,2,2};
System.out.println(Dup(arr));
    }
    static int Dup(int [] arr ){
        Arrays.sort(arr);
    
        int start = 0;
        int end = arr.length-1;
        
        while(start < end){
            int mid = start + (end - start)/2;
            
            //in this condition we have to check if consecutive element of the mid are equal then return mid as a duplicate element.
            if(mid > 0 && arr[mid] == arr[mid-1] || mid < arr.length && arr[mid] == arr[mid+1]){
                return arr[mid];
            }
            //duplicate element lies in the right side of the array.
            else if(arr[mid]  >= mid + 1){
                start = mid + 1;
            }
            //duplicate element lies in the left side of the array.
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
