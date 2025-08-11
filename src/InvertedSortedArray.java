public class InvertedSortedArray {
    public static void main(String[] args) {
        int[] arr={1,2};
        System.out.println(search(arr,2));
    }

    public static int search(int[] nums, int target) {
        // 4,5,6,7,0,1,2
        // L     M     R

        int left=0;
        int right=nums.length-1;
        while(left<=right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            //consider left side is sorted .
            if (nums[mid] >= nums[left]) {
                if (target < nums[mid] && target >= nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            //consider right side is sorted
            else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }

            }
        }
        return -1;
    }
}
