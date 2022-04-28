import java.util.regex.Pattern;

public class SubString {
    public static void main(String[] args) {
       String[] patterns = {"a","abc","bc","d"}; String word = "abc";
        System.out.println(Strin(patterns,word));
    }
    static int Strin(String [] patterns, String word){
        int count =0;
    for(int i =0; i<patterns.length; i++){
        if(word.contains(patterns[i]))
            count++;
    }
    return count;
    }
}
