public class KokoEating {
    //<!-- - [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/) -->
    public static void main(String[] args) {
        int piles[]= {3,6,7,11};int k; int h=8;
        System.out.println(koko(piles, h));
    }
    static int koko(int piles[], int h){
    int left = 1;
        int right = 1000000000;
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(canEatInTime(piles, mid, h)) right = mid - 1;
            else left = mid + 1;
        }
        return left;
    }
    static boolean canEatInTime(int piles[], int k, int h){
        int hours = 0;
        for(int pile : piles){
            int div = pile / k;
            hours += div;
            if(pile % k != 0) hours++;
        }
        return hours <= h;
    }
}
