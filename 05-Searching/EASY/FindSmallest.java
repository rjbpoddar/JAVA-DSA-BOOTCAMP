public class FindSmallest{
//- [Find Smallest Letter Greater Than Target](https://leetcode.com/problems/find-smallest-letter-greater-than-target/)
public static void main(String[] args) {
    char [] arr = {'c','f','j'};        
    char target = 'e';
    System.out.println(Find(arr, target));
    }
    static char Find(char[] arr, char target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];


    
    }
}