public class MaxRepeating{
    public static void main(String[] args) {
        String sequence="ababc"; String word="ba";
    System.out.println(Repeati(sequence, word));
    }
    static int Repeati(String sequence,String word){
        StringBuilder s = new StringBuilder(word);
    int count =0;
    while (sequence.contains(s)) {
        count++;
        s.append(word);
    }    
    return count;
    } 
}