public class TwoStringEqui {
    public static void main(String[] args) {
        String[] word1= {"a", "bc"};String[] word2 = {"ab", "c"};
        System.out.println(Equi(word1, word2));
    }
    static boolean Equi(String[] word1, String[] word2){
    StringBuilder s = new StringBuilder();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < word1.length; i++) {
        s.append(word1[i]);
    }
    for (int j = 0; j < word2.length; j++) {
        sb.append(word2[j]);
    }
    String a = s.toString();
    String b = sb.toString();
    if (a.equals(b)) {
        return true;
    }
    return false;
    }
}
