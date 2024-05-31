class Solution {
    public int totalMoney(int n) {
        int totalSum = 0;
        int mondayValue = 1;
        

        while( n > 0){
        int m = Math.min(n, 7);
        totalSum += sum(m , mondayValue);
        mondayValue++;
        n = n - 7;
        
        }
        return totalSum;
    }

    public static int sum(int n , int mondayValue ){
        int presentValue = 0;
         int totalSum = 0;

        for(int i = 0;i< n;i++){
            presentValue = mondayValue +i;
            totalSum += presentValue; 
        }
        return totalSum;
    
    }
    


}