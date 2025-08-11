public class Q1 {

    public static void main(String[] args) {

        String str="aabbccaa";
        int count=1;
        String ans="";
        StringBuilder s=new StringBuilder();
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)) {
                count++;
            }else{
                s.append(str.charAt(i)).append(count);
            ans=ans+str.charAt(i)+count;
            count=1;
            }

        }
        s.append(str.charAt(str.length()-1)).append(count);
        ans=ans+str.charAt(str.length()-1)+count;
        System.out.println(ans);
        System.out.println(s.toString());
    }
}
