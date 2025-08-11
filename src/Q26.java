public class Q26 {

    public static void main(String[] args) {
        System.out.println(presidntElec(5,3));
    }
    public static int presidntElec(int n,int k){
       int result=0;

       for(int i=2;i<=n;i++){
           result=(result+k)%i;
       }
        return result;
    }
}
