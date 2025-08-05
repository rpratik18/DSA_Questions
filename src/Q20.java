public class Q20 {

    public static void main(String[] args) {
        String str = "aabbbbCCddd";
        Result result = findLongestUniformSubstring(str);
        System.out.println("Start index: " + result.start + ", Length: " + result.length);
    }
    public static Result findLongestUniformSubstring(String s){

        if(s==null ||s.length()==0){
        return new Result(-1,0);
        }

        int maxstart=0;
        int maxlength=1;

        int currentstart=0 ,currentlength=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                currentlength++;
            }else{
                if(currentlength>maxlength){
                    maxlength=currentlength;
                    maxstart=currentstart;

                }
                currentlength=1 ;
                currentstart=i;
            }



        }
        if (currentlength > maxlength) {
            maxlength = currentlength;
            maxstart = currentstart;
        }
        return new Result(maxstart, maxlength);
    }
    static class Result{
        int start;
        int length;

        Result(int start,int lenghth){
            this.length=lenghth;
            this.start=start;
        }
    }

}
