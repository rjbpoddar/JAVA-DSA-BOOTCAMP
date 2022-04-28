public class ReachANumber{
    public static void main(String[] args) {
        //- [Reach a Number](https://leetcode.com/problems/reach-a-number/)
System.out.println(Reach()  );
    }
        static int Reach(){
    int sum = 0; int steps = 0;
    int target = 7;
    target= Math.abs(target);
    while (sum< target) {
        sum+=steps;
        steps++;
    }
    while (sum-target%2==1) {
        sum+=steps;
        steps++;
    }
    return steps -1;
    }

}