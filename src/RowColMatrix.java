public class RowColMatrix {

    public static void main(String[] args) {
        //search in matrix
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col=matrix[0].length-1;
        int left=0,right=matrix.length-1;
        while(row<=matrix.length-1 && col>=0){
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]>target){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
}
