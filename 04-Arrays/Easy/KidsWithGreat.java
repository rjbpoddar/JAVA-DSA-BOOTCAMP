//6. [Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/) -->

public class KidsWithGreat {
public static void main(String[] args) {
    int[] candy={ 2,3,5,1,3};int extra = 3;
    int []res = new int[candy.length];boolean result;
    for (int i = 0; i < candy.length; i++) {
        res[i]=  candy[i]+extra;
    
    if (res[i]>=candy.length) {
        
        result = true;
    }
    else{
        result = false;
    }
    System.out.println(result);
}}
}
