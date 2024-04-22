package Medium;

// Solution for LC 153
public class minRotatedArr {

    // Use BS
    int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(start < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[end]) {
                start = mid + 1;// search right side, all small elements are there
            } else if(nums[mid] <= nums[end]) {
                end = mid;
            }
        }
        return nums[start];
        //When start and end are equal then we found our answer, loop breaks, so we return the element at start or end index
    }
}
