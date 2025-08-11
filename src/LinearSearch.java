public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={2,1,4,-7,18,3,28};
        System.out.println(min(arr));
        

    }

    public static int min(int[] arr){
        int ans=arr[0];
        for(int i=0;i< arr.length;i++){
            if(ans>arr[i]){
                ans=arr[i];
            }
        }
        return ans;
    }
}
