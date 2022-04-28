public class Single {
    //- [Single Element in a Sorted Array](https://leetcode.com/problems/single-element-in-a-sorted-array/)
public static void main(String[] args) {
    int [] arr ={1,1,2,3,3,4,4,8,8};
System.out.println(SingleELe(arr));
}
static int SingleELe(int [] arr ){
    if(arr.length==1){
        return arr[0];
    }
    int start=0, end=arr.length-1;
    while(start<end){
        int mid = start + (end-start)/2;
        if(mid-1>=0 && arr[mid] == arr[mid-1]){ 
            if(mid%2 == 1){    
                start = mid+1;
            }
            else end = mid-1;
        }
        else if(mid+1<arr.length && arr[mid] == arr[mid+1]){
            if(mid%2 == 1){
                end = mid-1;
            }
            else start = mid+1;
        }
        else return arr[mid];
    }
    return arr[end];
}
}
