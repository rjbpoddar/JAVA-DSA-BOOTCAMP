public class FirstMissingPositive {
    public static void main(String[] args) {
        int [] nums = {1,2,0};
       System.out.println(Missing(nums));
    }
    static int Missing(int[]nums){
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0 || nums[i]>n){
            nums[i] = n+1;
            }
            }
for(int i=0;i<nums.length;i++){
int index = Math.abs(nums[i]);
      if(index>n){
      continue;
   }
index --;
            
            if(nums[index]> 0){
            nums[index] = (-1)* nums[index];
            }
            }
            
            for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
            return i+1;
            }
            }
            
            return n+1;
    }
}
