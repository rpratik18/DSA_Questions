public class Q24 {

    /*Given a string,
            return the pallindrome of maximum length and its length.
            (So, you return both the relevant pallindrome substring and its length).
    String str = "forgeekskeegfor";    // Return {"geeksskeeg",  10}*/
    public static void main(String[] args) {

    /*Integer a=128;
    Integer b=128;
        System.out.println(a==b);
*/
        String str = "forgeeksskeegfor";
        System.out.println(longestPalindrome2(str));
    }
    public static String[] lonegstPali(String s){
        int strart=0;
        int end=0;
        if(s==null || s.length()<1){
            return new String[]{"","0"};
        }

        for(int i=0;i<s.length();i++){
        for(int j=i;j<1;j++){

        }
        }
  return new String[]{"0"};
    }
    public static String longestPalindrome2(String str){
        if(str == null || str.isEmpty())
            return "";

        int len = str.length(), start =0, maxLen = 0, currLen =0;
        for(int i =0; i < len; i++){
            for(int j =0; j<=1; j++){
                int low =i, high = i+j;
                while(low >=0 && high < len && str.charAt(low) == str.charAt(high)){
                    currLen = high -low +1;
                    if(currLen > maxLen){
                        maxLen = currLen;
                        start = low;
                    }
                    low--;
                    high++;
                }

            }
        }
        return str.substring(start, start + maxLen);
    }

}
