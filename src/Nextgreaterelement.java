import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Nextgreaterelement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Build the map using a monotonic decreasing stack
        Map<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stk=new Stack();
        //1 3 4 2


        for(int num:nums2){
            while(!stk.isEmpty()&& num>stk.peek()){
                map.put(stk.pop(),num);
            }
            stk.push(num);//4
        }

        // Elements remaining in stack have no next greater, so no need to add to map
        // Construct result for nums1 using the map
        int[] arr=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            arr[i]= map.getOrDefault(nums1[i],-1);
        }
        return arr;
    }
}
