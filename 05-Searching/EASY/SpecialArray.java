public class SpecialArray {
//- [Special Array With X Elements Greater Than or Equal X](https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/)
    public static void main(String[] args) {
        System.out.println(Find());
    }
    static int Find(){
        int [] nums = {3,5};
        int n = nums.length;
        int x = 0;
        while (n >= x){
            int count = 0;
            for(int i = 0; i < nums.length; i++){
                if (nums[i] >= x){
                    count++;
                }
            }
            if (x == count){
                return x;
            }
            x++;
        }
        return -1;
    }
}
