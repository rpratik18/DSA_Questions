import java.util.HashMap;
import java.util.Map;

public class Q8 {
    public static void main(String[] args) {
        String str="abbacdd";
        Map<Character,Integer> st=new HashMap<>();
        char[] ch=str.toCharArray();
        for (char cha:ch){

                st.put(cha,st.getOrDefault(cha,0)+1);

        }

        for(Map.Entry<Character,Integer> entry:st.entrySet()){
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }

        }
    }
}
