import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q17 {
    public static void main(String[] args) {
        String[] dict = {"ab","abcd","bcdaf","bcad","acb","acab"};
        String input="abcd";
        char[] ch1=input.toCharArray();
        Arrays.sort(ch1);
        input=new String(ch1);
        List<String> output=new ArrayList<>();
       for(String str:dict){
           char[] ch2=str.toCharArray();
           Arrays.sort(ch2);
           String name=new String(ch2);
           if(input.equals(name)){
               output.add(str);
           }

       }
        System.out.println(output.toString());
    }
}
