import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramProgram {
    public static void main(String[] args) {
        //438. Find All Anagrams in a String
    }
    public List<Integer> findAnagrams(String s, String p) {
        int left=0;
        int startpos=0;
        char[] ch=s.toCharArray();

        int windowsize=p.length();
        List<Integer> list=new ArrayList();
        int[] sFreq=new int[26];
        int[] pFreq=new int[26];
        for(char c:p.toCharArray()){
            pFreq[c-'a']++;
        }
        if(windowsize > ch.length){

            return list;
        }
        for(int i=0;i<windowsize;i++){
            sFreq[ch[i]-'a']++;
            if(Arrays.equals(sFreq,pFreq)){
                list.add(i-windowsize+1);
            }
        }
        for(int i=windowsize;i<ch.length;i++){
            sFreq[ch[i]-'a']++;
            sFreq[ch[i-windowsize]-'a']--;

            if(Arrays.equals(sFreq,pFreq)){
                list.add(i-windowsize+1);
            }
        }
        return list;
    }
}
