public class SplitAndAlike {
    public static void main(String[] args) {
        String s = "book";
        // Splike(s);
        System.out.println(Splike(s));
    }
    static boolean Splike(String s){
        int lengthofeachstring = s.length()/2;
        String a = s.substring(0,lengthofeachstring);
        String b = s.substring(lengthofeachstring);
        int vowelina = 0;
        int vowelinb = 0;
        for (int i = 0; i < lengthofeachstring; i++){
            if (Character.toUpperCase(a.charAt(i)) == 'A' || Character.toUpperCase(a.charAt(i)) == 'E' || Character.toUpperCase(a.charAt(i)) == 'I' || Character.toUpperCase(a.charAt(i)) == 'O' || Character.toUpperCase(a.charAt(i)) == 'U'){
                vowelina++;
            } 
            if (Character.toUpperCase(b.charAt(i)) == 'A' || Character.toUpperCase(b.charAt(i)) == 'E' || Character.toUpperCase(b.charAt(i)) == 'I' || Character.toUpperCase(b.charAt(i)) == 'O' || Character.toUpperCase(b.charAt(i)) == 'U'){
                vowelinb++;
            }
        }
        return vowelina == vowelinb;
    }
}
