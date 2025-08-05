public class Q5 {
    public static void main(String[] args) {

    }

    public double medianfotwoarray(int[] nums1, int nums2[]){
        int X=nums1.length;
        int Y=nums2.length;

        if(X>Y){
            medianfotwoarray(nums2,nums1);
        }

        int left=0;
        int right=X;

        while (left<=right){
            int midX=(left+right)/2;
            int midY=(X+Y+1)/2-midX;

            int LeftmaxX=midX==0?Integer.MIN_VALUE:nums1[midX-1];
            int rightminX=midX==X?Integer.MAX_VALUE:nums1[midX];

            int LeftmaxY=midY==0?Integer.MIN_VALUE:nums2[midY-1];
            int rightminY=midY==Y?Integer.MAX_VALUE:nums2[midY];

            if(LeftmaxX<=rightminY && LeftmaxY <=rightminX){
                if((X+Y)%2==0){
                    return ((double) Math.max(LeftmaxX,LeftmaxY)+Math.max(rightminX,rightminY))/2;
                }
                else {
                    return ((double) Math.max(LeftmaxX,LeftmaxY)/2);
                }
            }else if (LeftmaxX>rightminY){
                left=midX-1;
            }else{
                right=midX;
            }
        }
        return -1;
    }
}
