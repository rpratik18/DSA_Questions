public class Q12 {
    public static void main(String[] args) {
        System.out.println(bishopCanReach(4, 4, 1, 7));
    }

    public static String bishopCanReach(int r1,int c1,int r2,int c2){
        if((r1+c1)%2!=(r2+c2)%2){
            return "NO";
        }
        if(r1==r2 && c1==c2){
            return "YES0";
        }
        if(Math.abs(r1-r2)==Math.abs(c1-c2)){
            return "YES1";
        }

        return "YES2";


    }
}
