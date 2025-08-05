public class Q10 {
    public static void main(String[] args) {
        String str="-";
        System.out.println(convertToInt (str));

    }
    public static int convertToInt (String str){
        try {
            int val=Integer.parseInt(str);
            return val;
        }catch (Exception e){

            return -1;
        }

    }
}
