import java.util.Arrays;

public class PermutationString {
    public static void main(String[] args) {
    //567. Permutation in String
    }

    public boolean checkInclusion(String s1, String s2) {

        int [] s1Freq=new int[26];
        int[] s2Freq=new int[26];
        int window=s1.length();
        char [] chS2=s2.toCharArray();
        if(window>chS2.length){
            return false;
        }
        for(char chS1:s1.toCharArray()){
            s1Freq[chS1-'a']++;
        }
        for(int i=0;i<window;i++){
            s2Freq[chS2[i]-'a']++;
            if(Arrays.equals(s2Freq,s1Freq)){
                return true;
            }
        }

        for(int i=window;i<chS2.length;i++){
            s2Freq[chS2[i]-'a']++;
            s2Freq[chS2[i-window]-'a']--;
            if(Arrays.equals(s2Freq,s1Freq)){
                return true;
            }
        }
        return false;
    }
}
