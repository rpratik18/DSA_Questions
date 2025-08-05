public class Q14 {
    public static void main(String[] args) {
        System.out.println(checkNumPower(1000));
    }
    public static boolean checkNumPower(int num){
        int power=0;
        int value=10;
        if (num == value) return true;
        while(value<=num){
            value=10*value;
            power++;
            if(num==value){
                return true;
            }
        }
        return false;
    }
}
