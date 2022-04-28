public class Missing {
public static void main(String[] args){
    // System.out.println();
    int [] arr = {3,0,1};
    System.out.println(Miss(arr));
    }        
    static int Miss(int [] arr){
    int i = 0;
    while (i<arr.length) {
        int correctindex = arr[i];
        if (arr[i]<arr.length && arr[i]!=arr[correctindex]) {
        swap(arr, i, correctindex);
        }
        else{
            i++;
        }
    }
    //search for missing number
    for(int index = 0; index <arr.length; index++){
        if (arr[index] != index) {
            return index;
        }
    }

    // case 2
    return arr.length;
    }
    
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
    