public class Ceiling {

    public static void main(String[] args) {
        int[] arr={2,4,7,9,11,15,19};
        int target=3;
        System.out.println(findCeiling(arr,target));
    }
    public static int findCeiling(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int result=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                right=mid-1;

            }else{
                left=mid+1;
                result=left;
            }
        }
        return result;
    }
}
