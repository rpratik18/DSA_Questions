import java.util.HashMap;
import java.util.Map;

public class Q34 {
    //Find the Smallest Non-Repeating Integer in an array.
    public static void main(String[] args) {
        int[] arr={2,3,4,1,1,2,4,5};
        Map<Integer,Integer> nums=new HashMap<>();

        for(int num:arr){
           nums.put(num,nums.getOrDefault(num,0)+1);

        }
        int minNum=Integer.MAX_VALUE;
        for (int num:arr){
            if(nums.get(num)<=1){

                if(num<minNum){
                    minNum=num;
                }
            }
        }
        System.out.println(minNum);

    }
}
