public class Q1 {

    public static void main(String[] args) {

        String str="a";
        int count=1;
        String ans="";
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)) {
                count++;
            }else{
            ans=ans+str.charAt(i)+count;
            count=1;
            }
        }
        ans=ans+str.charAt(str.length()-1)+count;
        System.out.println(ans);
    }
}
