public class GoalParser {
    public static void main(String[] args) {
       String command = "G()(al)";
        System.out.println(Goal(command));
    }
    static String Goal(String command){
        char ch[]=command.toCharArray();
       StringBuilder s = new StringBuilder();
       for (int i = 0; i < command.length(); i++) {
        if(ch[i]=='G')
        s.append('G');
    else if(ch[i]=='(' && ch[i+1]=='a')
        s.append("al");
    else if(ch[i]=='(' && ch[i+1]==')')
        s.append('o');
    else
        continue;
       }
       return s.toString();
        
    }
}
//Under return is a one liner
//    return (command.replace("()","o")).replace("(al)","al");