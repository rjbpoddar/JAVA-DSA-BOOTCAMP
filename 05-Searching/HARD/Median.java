public class Median{
    public static void main(String[] args) {
    int [] num1 = {1,2};
    int [] num2 = {3,4};
System.out.println(merge(num1, num2));
    }
    static double merge(int[] num1 , int num2[]){
    int [] result = new int [num1.length+num2.length];
    System.arraycopy(num1, 0, result, 0, num1.length);
    System.arraycopy(num2, 0, result, num1.length, num2.length);
    //System.out.println("The Marged version is "+result);
    int start = result[0];
    int end = result.length-1;
    int middle = result.length/2;
    if(result.length % 2 == 0){
        return (result[middle -1] + result[middle])/2.0;
    }else{
        return result[middle]/1.0;
    }
    }
}