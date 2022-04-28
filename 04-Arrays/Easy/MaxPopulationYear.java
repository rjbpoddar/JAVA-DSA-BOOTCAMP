public class MaxPopulationYear {
    public static void main(String[] args){
        // System.out.println();
        int [][] logs = {{1950,1961},{1960,1971},{1970,1981}};
        int maxValue = 0;
        int year = 1950;
        //minimum year possible = 1950
        //maximum year possible = 2050 => d = 101
        int[] arr = new int[101];   
        for(int i = 0; i< logs.length; i++){
            for(int j=logs[i][0]; j<logs[i][1]; j++){ //death year not counted
                arr[j - 1950]++;
            }
        }
        for(int i = 0; i< 101; i++){
            if(maxValue < arr[i]){
                year = i + 1950;
                maxValue = arr[i];
            }
        } System.out.println(year);
        }
     
}
