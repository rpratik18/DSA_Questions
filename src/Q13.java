public class Q13 {

    public static void main(String[] args) {
        int[] nums={2,4,6,10,2,1};
       /* System.out.println(SlidingWindow(nums,3));*/
        System.out.println(shortestSubarrayWithSumK(nums,12));

    }

    public static int SlidingWindow(int[] nums,int windowsize){

        int windowsum=0;


        for(int i=0;i<windowsize;i++){
            windowsum+=nums[i];
        }
        int maxsum=windowsum;
        for (int i=windowsize;i<nums.length;i++){
            windowsum=windowsum+nums[i]-nums[i-windowsize];
            maxsum=Math.max(maxsum,windowsum);
        }
        return maxsum;
    }

    public static  int shortestSubarrayWithSumK(int[] nums,int k){
        int minLen=Integer.MAX_VALUE;

        for (int start=0; start<nums.length;start++){
            int sum = 0;

            for (int end=start;end< nums.length;end++){
                sum += nums[end];
                if (sum==k){
                    int length=end-start+1;
                    minLen=Math.min(length,minLen);

                }
            }

        }
        return (minLen==Integer.MAX_VALUE)?-1:minLen;


    }
}
