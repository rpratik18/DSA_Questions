public class Q22 {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
    public static int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int temp=0,prev=1,next=2;
        for(int i=2;i<n;i++){
            temp=prev+next;
            prev=next;
            next=temp;
        }
        return next;
    }
}
