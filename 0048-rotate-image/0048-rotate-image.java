class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int a;
        int b;
        int temp = 0;
        //reversing the columns
        for(int i = 0;i<n;i++){
            a = 0;
            b = n-1;
            while(a<=b){
                temp = matrix[a][i];
                matrix[a][i] = matrix[b][i];
                matrix[b][i] = temp;
                a++;
                b--;
            }    
        }
        //transposing it 
        for(int i = 0;i<n;i++){
            for(int j = i+1 ;j<n;j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}