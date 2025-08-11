public class maxSubArray {

    //53. Maximum Subarray

    public static int maxSubArray(int[] nums) {
        int sum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){

            if(sum>0){
                sum+=nums[i];

            }else{
                sum=nums[i];
            }
            maxsum=Math.max(sum,maxsum);

        }
        return maxsum;
    }
}
