import java.util.Arrays;

public class RelativeSort {
    public static void main(String[] args) {
    int [] arr1 = {2,3,1,3,2,4,6,7,9,2,19};int[] arr2 = {2,1,4,3,9,6};
System.out.println(Arrays.toString(Relative(arr1, arr2)));
    }
    static int[] Relative(int[] arr1,int[] arr2){
        int[] freq=new int[1001];
        for(int a:arr1)
        {
            freq[a]++;
        }
        int j=0;
        for(int a:arr2)
        {
            int n=freq[a];
            while(n>0)
            {
                arr1[j++]=a;
                n--;
            }
            freq[a]=0;
        }
        for(int i=0;i<1001;i++)
        {
            int n=freq[i];
            while(n>0)
            {
                arr1[j++]=i;
                n--;
            }
            freq[i]=0;
        }
        return arr1;
    }
}
