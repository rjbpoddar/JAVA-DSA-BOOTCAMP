public class CountItemsMatchRule{
    public static void main(String[] args){
        // System.out.println();
        String[][] items ={ {"phone","blue","pixel"},
                          {"computer","silver","lenovo"},
                          {"phone","gold","iphone"}}; 
        String ruleKey="color"; String ruleValue = "silver" ;
}      
static int Matching(String[][] items, String ruleKey,String ruleValue){
    int temp;
    if (ruleKey.equals("type")) {
        temp = 0;
    } else if (ruleKey.equals("color")) {
        temp = 1;
    } else {
        temp = 2;
    }
    int count = 0;
    for (String[] item : items)
        if (item.length.equals(ruleValue))
            count++;
    return count;
        }
}
                        
   
}