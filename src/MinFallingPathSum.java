public class MinFallingPathSum {

    public int minFallingPathSum(int[][] matrix) {

        //Edge case
        if(matrix == null || matrix.length == 0)
            return 0;

        //Base case
        if(matrix.length == 1 && matrix[0].length ==1)
            return matrix[0][0];
        int minSum = Integer.MAX_VALUE;


        for(int i =0; i< matrix.length; i++){
            for(int j =0; j < matrix.length; j++){
                if(i > 0){
                    if(j > 0 && j < matrix.length -1)
                        matrix[i][j] = Math.min(matrix[i-1][j], Math.min(matrix[i-1][j-1] , matrix[i-1][j+1])) +  matrix[i][j];
                    else if( j > 0)
                        matrix[i][j] = Math.min(matrix[i-1][j-1] , matrix[i-1][j]) +  matrix[i][j];
                    else if(j < matrix.length -1)
                        matrix[i][j] = Math.min(matrix[i-1][j] , matrix[i-1][j+1]) +  matrix[i][j];
                }
                if( i == matrix.length -1 && minSum > matrix[i][j])
                    minSum = matrix[i][j];
            }

        }
        return minSum;
    }

}
