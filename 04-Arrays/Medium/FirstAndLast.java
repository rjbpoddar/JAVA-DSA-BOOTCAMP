public class FirstAndLast {
    public static void main(String[] args){
        int[] arr ={ 2,4,6,7,7,8,8,10};
        int target = 7;
        System.out.print(FirstElement(arr, target)+"  ,  "+ LastElement(arr, target) + " ");
                }
        
        static int FirstElement(int[] arr, int target){
            int index = -1;// when the array doesn't contain the element then return it
            int start = 0;
            int end = arr.length -1;
            while(start<=end){
                int mid = start + (end -start )/2;
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
        static int LastElement(int [] arr , int target ){
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
