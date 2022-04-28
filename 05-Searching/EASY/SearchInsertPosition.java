public class SearchInsertPosition {
//- [Search Insert Position](https://leetcode.com/problems/search-insert-position/)
public static void main(String[] args) {
    int [] arr = {1,3,5,6};
    int target = 2;
    System.out.println(Search(arr,target));
    }
    static int Search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
    
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target < arr[mid]){
                end=mid-1;
            }else if (target > arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
    
        }
        return end+1;
    }
}
