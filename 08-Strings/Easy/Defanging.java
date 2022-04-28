public class Defanging{
    public static void main(String[] args) {
        String add = "1.1.1.1";
        System.out.println(Defang(add));
    }
    static String Defang(String add){
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < add.length(); i++) {
        if (add.charAt(i)=='.') {
            s.append("[.]");
        }else
        s.append(add.charAt(i));
    }

return s.toString();
  
    }
}