public class Q18 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};     // Expected: 0
        int[] arr2 = {0, 1, 3, 4};     // Expected: 2
        int[] arr3 = {0, 1, 2, 3, 4};  // Expected: 5

        System.out.println(findMissing(arr1)); // 0
        System.out.println(findMissing(arr2)); // 2
        System.out.println(findMissing(arr3)); // 5
    }

    public static int findMissing(int[] nums){
        int count;
        for(int i=0;i<nums.length;i++){
            if (nums[i]!=i) {
                return i;
            }
        }

        return nums.length;
    }
}
