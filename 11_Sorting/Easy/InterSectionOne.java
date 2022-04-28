public class InterSectionOne {
    public static void main(String[] args) {
    int [] arr1= {1,2,2,1};    
    int [] arr2= {2,2};
        Inter(arr1, arr2);
    }    static void Inter(int[] arr1, int[] arr2){
        int i =0;
        int j = 0;
    while (i<arr1.length && j<arr2.length) {
        if (arr1[i]==arr2[j]) {
            // return new int[] {arr1[i]};
            System.out.println(arr1[i]);
            i++;
            j++;
        }
        else if(arr1[i]>arr2[j]){
            j++;
        }
        else{
            i++;
        }
    }
    }

}
