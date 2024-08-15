class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         if(matrix.length == 0) return false;

        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0;
        int right = row * col;
        

        while(left < right){
            int mid = (left + right)/2;

            if(matrix[mid/col][mid % col] == target){
                return true;
            }else if(matrix[mid/col][mid % col] <target){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return false;   
    }
}