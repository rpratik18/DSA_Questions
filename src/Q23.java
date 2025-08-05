import java.util.Arrays;

public class Q23 {
    public static void main(String[] args) {
        /*Given a matrix of size m * n,
        return the maximum path sum in the matrix.
    [You start from the top-left corner of the matrix and may up, down and diagonally].

        Example:
        Matrix      10 10  2  0 20  4
        1  0  0 30  2  5
        0 10  4  0  2  0
        1  0  2 20  0  4*/

        int [][] arr={{10,10,2,0,20,4},
                      {1,0,0,30,2,5},
                      {0,10,4,0,2,0},
                      {1,0,2,20,0,4}
        };

        int m=arr.length;
        int n=arr[0].length;
        for(int i=1;i<arr[0].length;i++){

            arr[0][i]=arr [0][i]+arr[0][i-1];

        }
        for(int i=1;i<arr.length;i++){
            arr[i][0]=arr[i][0]+arr[i-1][0];
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                arr[i][j]=arr[i][j]+Math.min(arr[i-1][j],arr[i][j-1]);

            }
        }
        System.out.println(arr[m-1][n-1]);

    }
}
