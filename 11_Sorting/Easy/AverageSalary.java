    public class AverageSalary {
    public static void main(String[] args) {
    int [] nums = {4000,3000,1000,2000};
    System.out.println(AverageSala(nums));
    }
    static double AverageSala(int [] nums){
    insertion(nums);
    double sum =0;
    double avg =0;
    for (int i = 1; i <nums.length-1; i++) {
        sum+= nums[i];
    }
    return sum/(nums.length-2);
    }
    static void insertion(int[] num){
    for (int i = 0; i < num.length-1; i++) {
    for (int j = i+1; j >0; j--) {
        if (num[j]<num[j-1]) {
            swap(num, j, j-1);
        }
        else{
            break;
        }
        }
    }
    }
    static void swap(int [] arr, int first, int second){
        int temp=  arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    }
    