public class climbStairsTest {


    public int climbStairs(int n) {

        if(n == 1)
            return n;
        int top = 1, prev1 =1, prev2 = 0;
        for(int i = n-2; i >= 0; i --){
            prev2 = prev1 + top;
            top = prev1;
            prev1 = prev2;
        }

        return prev2;
    }
}
