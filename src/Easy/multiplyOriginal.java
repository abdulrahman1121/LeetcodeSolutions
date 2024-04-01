package Easy;

// LC 2154
public class multiplyOriginal {
    int findFinalValue(int[] nums, int original) {
        for(int i = 0; i < nums.length;) {
            if(nums[i] == original) {
                original *= 2;
                i = 0;
            } else {
                i++;
            }
        }
        return original;
    }
}
