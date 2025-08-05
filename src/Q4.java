import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q4 {
    public static void main(String[] args) {

        int x = 0;
        int y = 0;


        String dir="UUU";


        char[] token=dir.toCharArray();
        System.out.println(Arrays.toString(token));

        for(int i=0;i< token.length;i++) {


            switch (token[i]) {
                case 'U':
                    y++;
                    break;
                case 'R':
                    x++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
            }
        }

        System.out.println(Arrays.toString(new int[]{x, y}));
    }
}
