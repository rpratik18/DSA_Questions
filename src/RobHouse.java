public class RobHouse {

    public int rob(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];

        nums[1] = (nums[0] > nums[1]) ? nums[0] : nums[1];

        for(int i =2; i < nums.length; i++){
            nums[i] = Math.max(nums[i-2] + nums[i], nums[i-1]);
        }

        return nums[nums.length -1];
    }
}
