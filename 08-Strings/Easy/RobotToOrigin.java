public class RobotToOrigin {
    public static void main(String[] args) {
        String moves = "UDLr";
        System.out.println(Robo(moves));
    }
    static boolean Robo(String moves){
        char ch[] = moves.toCharArray();
        int x = 0, y = 0;
    for (int i = 0; i < moves.length(); i++) {
        if (ch[i]=='U') {
            y--;
        }
        else if(ch[i]=='D')
        y++;
        else if(ch[i]=='R')
        x++;
        else
        x--;
    }return x == 0 && y == 0;
    }
}
