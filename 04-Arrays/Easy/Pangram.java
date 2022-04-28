public class Pangram {  
    //10. [Check if the Sentence Is Pangram](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)
public static void main(String[] args){
    // System.out.println();
    String arr ="the quick brown fox jumps over the lazy dog";
    System.out.println(IsPangram(arr.toLowerCase()));
    }
    static boolean IsPangram(String arr){
        
    //System.out.println(arr.length());
        if (arr.length()<26) {
          return false;
        }
        else{
            for (char i = 'a'; i <= 'z'; i++) {
                if (arr.indexOf(i)<0) {
                    return false;
                }
                
            }
        }
        return true;
    }
    
}
