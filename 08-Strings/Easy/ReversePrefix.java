public class ReversePrefix {
    public static void main(String[] args) {
        String word ="abcdefd"; char ch='d';
System.out.println(reversePrefix(word, ch));
    }
    static String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        int index=0;
        for(i=0;i<word.length();i++)
        {
            if(ch==word.charAt(i))
            {
               index=i;
                break;
            }
        }
        sb.append(word.substring(0,index+1));
        sb.reverse();
        sb.append(word.substring(index+1));
        return sb.toString();
        
    }
}
