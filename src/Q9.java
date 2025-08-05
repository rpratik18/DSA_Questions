import java.util.Arrays;

public class Q9 {
    public static void main(String[] args) {
        String str = "the quick the brown quick brown the frog";
        String [] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));
        String word1 = "quick";
        String word2 = "frog";
        int word1dist=-1 ,word2dist=-1;
        for (int i=0;i< arr.length;i++){
            if(word1.equals(arr[i])){
                word1dist=i;
            }
            if(word2.equals(arr[i]))
                word2dist=i;
        }
        System.out.println("total distance="+(word2dist-word1dist-1));

    }
}
