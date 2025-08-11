public class findPeakElement
{
    //162.find peak element.
    public static void main(String[] args) {
        int[] nums ={1,2,3,1};
        //               L R= l+r/2=5/2=2
                        //M
        System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int[] arr) {
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=left+(right-left)/2;

            if(arr[mid]>arr[mid+1]){
                right=mid;

            }else{
                left=mid+1;


            }



        }
        return right;
    }
}
