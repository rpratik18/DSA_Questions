import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        //3. Longest Substring Without Repeating Characters
    }
    public int lengthOfLongestSubstring(String s) {
        int left=0 ;
        int widowlen=0,maxlen=0;
        Set<Character> set=new HashSet();
        char[] ch=s.toCharArray();
        for(int right=0;right<ch.length;right++){
            while(set.contains(ch[right])){
                set.remove(s.charAt(left));
                widowlen--;
                left++;
            }
            set.add(ch[right]);
            widowlen++;
            maxlen=Math.max(widowlen,maxlen);


        }
        return maxlen;
    }
}
