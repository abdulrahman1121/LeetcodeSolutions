package Medium;

// LC #34, find first and last index of target.34
public class FirstAndLast {
    int[] searchRange(int[] nums, int target) {
        int[] answer = new int[2];
        answer[0] = startIndex(nums, target);
        answer[1] = endIndex(nums, target);
        return answer;
    }

    int startIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target > nums[mid]) {
                start = mid + 1;
            } else if(target < nums[mid]) {
                end = mid - 1;
            } else {
                index = mid;
                end = mid - 1;
            }
        }
        return index;
    }

    int endIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target > nums[mid]) {
                start = mid + 1;
            } else if(target < nums[mid]) {
                end = mid - 1;
            } else {
                index = mid;
                start = mid + 1;
            }
        }
        return index;
    }
}


