import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class AddToArray {
    public static void main(String[] args){
    int [] arr = {1,2,0,0};int k = 650;
    int n = arr.length;
    int i = n-1;
    List <Integer> sol = new ArrayList<>();
    while (i>=0 || k>0)  {
        if (i>=0) {
        sol.add((arr[i]+k)%10);
        k = (arr[i]+k) /10; 
        }
    else{
        sol.add(k%10);
        k = k/10;
    }
    i--;
    }
    Collections.reverse(sol);
    System.out.println(sol);
    }
}
