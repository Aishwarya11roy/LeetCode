class Solution {
    public int trap(int[] height) {
        int leftMax = 0;
        int rightMax = 0;
        int waterTrapped = 0;
        int right = height.length-1;
        int left = 0;

        while(left < right){
            if(height[left] < height[right]){
                if(height[left] >= leftMax){
                    leftMax = height[left];
                }else{
                    waterTrapped += leftMax - height[left];
                }
                left++;
            }else{
                if(height[right] >= rightMax){
                    rightMax = height[right];
                }else{
                    waterTrapped += rightMax - height[right];
                }
                right--;
            }
    
        }
        return waterTrapped;



    }
}