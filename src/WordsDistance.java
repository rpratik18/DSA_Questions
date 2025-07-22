public class WordsDistance {



    public static int getShortestDistance(String pharse, String w1, String w2) {
        int res = -1, index1 = -1;

        String[] words = pharse.split(" ");

        for(int i =0; i < words.length; i ++){
            if(words[i].equals(w1)){
                index1 = i;
            } else if(words[i].equals(w2) && index1 != -1){
                int currLen = i - index1 -1;
                if(currLen < res || res == -1){
                    res = currLen;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String str = "the quick frog the brown quick brown the frog";
        String word1 = "quick";
        String word2 = "frog";

        System.out.println(getShortestDistance(str, word1, word2));
    }

}
