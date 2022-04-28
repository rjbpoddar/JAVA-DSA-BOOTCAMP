import java.util.Arrays;

public class FairCandyShop {
    //- [Fair Candy Swap](https://leetcode.com/problems/fair-candy-swap/)
    public static void main(String[] args) {
        int [] aliceSizes = {1,1};int []  bobSizes = {2,2};    
        System.out.println(Arrays.toString(Fairy(aliceSizes, bobSizes)));
    }
    static int[] Fairy(int []aliceSizes,int [] bobSizes){
        int sum1=0;
        int sum2=0;
        
        for(int i=0;i<aliceSizes.length;i++)  //find sum of alicesizes array
        {
            sum1=sum1+aliceSizes[i];
        }
        for(int i=0;i<bobSizes.length;i++)   //find sum of bobsizesarray
        {
            sum2=sum2+bobSizes[i];
        }
        
        int diff=(sum1-sum2)/2;  /*it comes from the equation when alice gives x candies                                                    and receives y candies and bob gives y candies and receives x
                                                                   so sum1-x+y=sum2+x-y
                                                                    y=(sum2-sum1)/2+x*/
        int res[]=new int[2];
        for(int i=0;i<aliceSizes.length;i++)
        {
            for(int j=0;j<bobSizes.length;j++)
            {
                if(aliceSizes[i]==bobSizes[j]+diff)
                {
                    res[0]=aliceSizes[i];
                    res[1]=bobSizes[j];
                }
            }
        }
        return res;
        
    }
    }
