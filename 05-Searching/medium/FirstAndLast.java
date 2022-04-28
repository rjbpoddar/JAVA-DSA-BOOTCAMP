public class FirstAndLast{
//- [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
    public static void main(String[] args) {
    int [] arr ={5,7,7,8,8,10};
    int target =8;
   System.out.print(FirstElement(arr,target)+ "   ,   " +LastElement(arr, target));

}
    static int FirstElement(int [] arr, int target){
    int index = -1;
    int start = 0;
    int end = arr.length-1;
    while (start<=end) {
        int mid = start+(end - start )/2;
        if (arr[mid]>= target ) {
            end = mid -1;
        }
        else {
            start = mid +1;
        }
        if (arr[mid]== target){
            index = mid;
        }
    }
    return index;
    }
    static int LastElement(int [] arr, int target){
        int index = -1 ;
            int start = 0;
            int end = arr.length -1;
            while(start<=end){
                int mid = start + (end -start )/2;
                if ( arr[mid]<= target){
                    start = mid+1;
                }
                else{
                    end = mid -1;
                }
                if (arr[mid]== target){
                    index = mid;
                }
            }

             return index;
    }
}