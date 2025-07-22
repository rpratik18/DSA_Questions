//https://leetcode.com/problems/trapping-rain-water/
public class RainWaterTrapping {

    public int trap(int[] height) {
        //Base case
        if(height == null || height.length < 2)
            return 0;

        int l = 0, r = height.length -1, trappedWater = 0;
        int leftMax = height[0], rightMax = height[height.length -1];

        while(l < r){
            if(height[l] > height[r]){
                if(height[r] > rightMax)
                    rightMax = height[r];
                else
                    trappedWater += rightMax - height[r];
                r--;
            } else {
                if(height[l] > leftMax)
                    leftMax = height[l];
                else
                    trappedWater += leftMax - height[l];
                l++;
            }

        }
        return trappedWater;
    }

}
