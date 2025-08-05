public class MinimumPathSum {

    public static void main(String[] args) {


      int [][]arr= {{1,5,1}
                   ,{2,3,4},
                     {6,1,1}};

//    int [][]arr ={{1,2,3},
//                {4,5,6}};
    minmunpath(arr);

}

public static int minmunpath(int[][] input){

    int m=input.length;
    int n=input[0].length;

    int[][] dp = new int[m][n];

    dp[0][0] = input[0][0];

    for(int j=1;j<n;j++){
        dp[0][j]= dp[0][j-1]+input[0][j];
    }

    for (int i = 1; i < m; i++) {
        dp[i][0] = dp[i - 1][0] + input[i][0];
    }
    for (int i = 1; i < m; i++) {
        for (int j = 1; j < n; j++) {
            dp[i][j] = input[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);

        }

    }


    System.out.println(dp[m-1][n-1]);

    return dp[m-1][n-1];
}


        }
