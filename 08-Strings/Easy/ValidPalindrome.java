public class ValidPalindrome{
    public static void main(String[] args) {
    String  s = "Aba";
    System.out.println(Validity(s));
    }
    static boolean Validity(String s){
    String str= s.toLowerCase();
    if (str.length()==0){
        return true;
    } 
    for(int i =0; i< str.length()/2;i++){
    char start = str.charAt(i);
    char end = str.charAt(str.length()-1-i);   
    if (start!=end) {
        return false;
    }
    }
    return true;


    }
    static void revers(String s){
        char str[] = s.toCharArray();

        int n = str.length; // length of character array
 
        int start=0,end = n-1;
 
        while(start<=end){
 
            // Swapping the characters
 
            char temp = str[start];
 
            str[start] = str[end];
 
            str[end] = temp;
 
            start++;
 
            end--;
 
        }
 
 
        //  Converting characterArray to String
 
        String reversedString = String.valueOf(str);
 
 
        System.out.println("Reversed string: "+reversedString); //  Printing the reversed String
    }
}