public class BinaryAscending {
    public static void main(String[] args){
        // System.out.println();
        int [] arr={2,6,8,9,14,15,18,19,20,24,26,26,28,32,36,80};
        int target = 80;
        int ans = BsSearch(arr, target);
        System.out.println(ans);
        // System.out.println(arr[26]);
        }
        static int BsSearch(int []arr,int target){
        int start =0;
        int end = arr.length -1;
        while(start<= end){
            int mid = start+(end-start)/2;
            if (target<arr[mid]) {
             end = mid-1;
            }
            else if (target>arr[mid]){
                start=mid+1;
            }
            else{
                //ans found
                return mid;
            }
        }
        return -1;
    }
}