public class RichestCustomerWealth {
    //4. [Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/) -->
    public static void main(String[] args){
        // System.out.println();
        int [][] accounts =  {{1,5},
                              {7,5},  
                              {3,5}};
        int wealth = -1;
    for (int i =0; i<accounts.length;i++){
            int temp = 0;
        for (int j = 0; j < accounts[i].length; j++) {
            temp= temp+accounts[i][j];
        }
        if (temp> wealth) {
            wealth = temp;
        }
        }
        System.out.println(wealth);
        }
}
