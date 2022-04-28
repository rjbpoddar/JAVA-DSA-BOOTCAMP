public class Decryption {
    public static void main(String[] args) {
     String s = "10#11#12";
        System.out.println(Alpha(s));
    }
    static String Alpha(String s){
        StringBuilder str = new StringBuilder();
	int i = 0;
	char ch;
	while(i < s.length()) {
		if(i + 2 < s.length() && s.charAt(i+2) == '#') {
			ch = (char)(Integer.parseInt(s.substring(i, i+2)) + 96);
			i+=3;
		} else {
			ch = (char)(Integer.parseInt(s.substring(i, i+1)) + 96);
			i++;
		}
		str.append(ch);
	}

	return str.toString();
    }
}
