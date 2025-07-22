public class FibonocciTest {

    public static void main(String[] args) {

        int n=5;

        int priv1=0, priv2=1 , current=0;
        for(int i=1;i<n;i++){
            current=priv1+priv2;
            priv1=priv2;
            priv2=current;

        }
        System.out.println(current);
    }
}
