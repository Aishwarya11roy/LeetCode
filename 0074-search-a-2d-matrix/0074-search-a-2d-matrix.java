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
/**
Given the array is sorted we would use binary search 
The 2d array is flattened to 1 d array.
For instance, a matrix with m rows and n columns can be conceptually flattened into a 1D array of length m * n."
1. Row Calculation (mid / col):
Division by col (number of columns) gives the row index because every col number of elements completes one row in the matrix.
For example, if mid = 6 and col = 4, then:
6 / 4 = 1
This means the 6th element in the flattened 1D array lies in row 1 of the 2D matrix.
2. Column Calculation (mid % col):
The modulus operation by col gives the column index within that row. This is because the remainder of dividing by col tells us how far into the row the element is.
Continuing with the same example where mid = 6 and col = 4:
6 % 4 = 2
This means the 6th element is in the 2nd column of the 1st row in the matrix.

 */