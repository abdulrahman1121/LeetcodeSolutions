package Easy;

// LC 747
public class uniqueInteger {

    int dominantIndex(int[] nums) {
        //brute force
        int max = 0;
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if((nums[i] * 2) > max && i != index) {
                return -1;
            }
        }
        return index;
    }
}
