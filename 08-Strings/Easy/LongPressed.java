public class LongPressed {
    public static void main(String[] args) {
      String  name = "alex"; String typed = "aaaleex";
        System.out.println(LongPr(name, typed));
    }
    static boolean LongPr(String name,String typed){
    int i =0;
    int j =0;
    while(i<name.length()&& j <typed.length()){
    if(name.charAt(i)== typed.charAt(j)){
        i++;j++;
    }
    else if(i>0 && name.charAt(i-1)==typed.charAt(j)){
        j++;
    }
    else{
        return false;
    }}if(i != name.length())
    return false;
while(j<typed.length()){
    if(i>0 && name.charAt(i-1)!=typed.charAt(j))
        return false;
    j++;
    }

return true; 
    }
    
}
