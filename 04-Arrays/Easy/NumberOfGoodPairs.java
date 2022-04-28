import java.util.Arrays;
//7. [Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/) 
public class NumberOfGoodPairs {
    public static void main(String[] args){
        int [] arr ={1,2,3,1,1,3};
        int res=0;
        for(int i = 0;i<arr.length;i++){
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]== arr[j] && i<j) {
res=res+1;
}
}
}
System.out.println(res); 
}
}
