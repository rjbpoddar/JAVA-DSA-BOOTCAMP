public class PeakIndex {
//- [Peak Index in a Mountain Array](https://leetcode.com/problems/peak-index-in-a-mountain-array/)
    public static void main(String[] args) {
    int [] arr = {0,6,10,14,18,19,15,10,9,1};
        System.out.println(Mountain(arr)    );
}
static int Mountain(int [] arr ){
    int start = 0;
    int end = arr.length-1;
    while (start<end) {
        int mid = start+(end- start)/2;
        if (arr[mid]>arr[mid+1]) {
            end = mid;
    }
    else{
        start = mid +1;
    }
    }
    return  start;
}
}
