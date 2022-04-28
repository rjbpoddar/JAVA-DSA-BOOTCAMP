public class MergeAlt {
    public static void main(String[] args) {
        String word1="abc";String word2= "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }
    static String mergeAlternately(String word1, String word2){
    StringBuilder s = new StringBuilder();
            int n= word1.length();
            int m = word2.length();
            
            int len = n>m?n:m;
            
            for(int i=0;i<len;i++)
            {
                if(i<n)
                    s.append(word1.charAt(i));
                if(i<m)
                    s.append(word2.charAt(i));            
            }
            
            return s.toString();
        }
    
    }

