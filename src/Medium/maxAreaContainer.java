package Medium;

public class maxAreaContainer {
    int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right) {
            if(height[left] < height[right]) {
                maxArea = Math.max(maxArea, (right - left) * height[left]);
                left++;
            } else {
                maxArea = Math.max(maxArea, (right - left) * height[right]);
                right--;
            }
        }

        return maxArea;
    }
}
