public class Reverse {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
System.out.println(Rever(s));
    }
    static String Rever(String s){
         StringBuilder result = new StringBuilder();
         StringBuilder word = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                word.append(s.charAt(i));
            } else {
                result.append(word.reverse());
                result.append(" ");
                word.setLength(0);
            }
        }
        result.append(word.reverse());
        return result.toString();
    }
}
