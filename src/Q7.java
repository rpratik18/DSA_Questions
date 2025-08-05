import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.List;

public class Q7 {
    public static void main(String[] args) {

        String[] arr = {"apple", "applet", "bread", "aper"};
        String prefix = "app";

        List<String> matchingWords = getWordsWithPrefix(arr, prefix);
        System.out.println("list"+matchingWords.toString());
    }
    public static List<String> getWordsWithPrefix(String[] words, String prefix){
        List<String> result = new ArrayList<>();

        for(String word:words){
            if (word.startsWith(prefix)){
                result.add(word);
            }
        }
        return result;
    }
}
