class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endColumn = matrix[0].length - 1;
        int n = endColumn;

        while(startRow <= endRow && startCol <= endColumn){
            int midRow = (startRow + endRow)/2;
            int midCol = (startCol + endColumn)/2;
            if(matrix[midRow][midCol] < target && matrix[midRow][n] > target){
                startCol = midCol+1;
            }else if(matrix[midRow][n] < target){
                startRow = midRow +1;
            }else if(matrix[midRow][midCol] > target && matrix[midRow][0] < target){
                endColumn = midCol - 1;
            }else if(matrix[midRow][0] > target){
                endRow = midRow - 1;
            }else{
                return true;
            }
        }

        return false;
        
    }
}
