public class MaxAvgSubArray {

    public static double findMaxAverage(int[] nums, int k) {

        int windowsum=0;

        for(int i=0;i<k;i++){
            windowsum+=nums[i];

        }
        int maxsum=windowsum;
        for(int i=k;i<nums.length;i++){
            windowsum+=nums[i]-nums[i-k];
            maxsum= Math.max(windowsum,maxsum);
        }
        return (double)maxsum/k;
    }
}
