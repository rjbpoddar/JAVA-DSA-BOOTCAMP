public class ExcelColumn {
    public static void main(String[] args) {
        int columnNumber = 701;
        System.out.println(Exce(columnNumber));
    }
    static String Exce(int columnNumber ){
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            sb.append((char)((columnNumber % 26) + 'A'));
            columnNumber /= 26;
        }
        return sb.reverse().toString(); 
    }
}
