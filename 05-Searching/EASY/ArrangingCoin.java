public class ArrangingCoin {
    //- [Arranging Coins(Easy)](https://leetcode.com/problems/arranging-coins/)
public static void main(String[] args) {
int n = 5;    
System.out.println(Arrannge(n)      );
}
static int Arrannge(int n){
    long start=0;
        long end=n;
       
        while(start<=end)
        {
            long mid=start+(end-start)/2;
            long sum=mid*(mid+1)/2; //Total sum of the coin 
            
            if(sum==n)       
            {
                return (int)mid;
            }
            else if(sum > n)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return (int)end;  //Take care of Type conversions from long to int
    }
}