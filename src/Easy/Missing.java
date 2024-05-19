package Easy;

class Missing {
    public int missingNumber(int[] nums) {
        // Start from 0, so correct index = i;
         int i = 0;
         while(i < nums.length) {
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
         }

         for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index) {
                return index;
            } 
         }
         return nums.length;
    }

    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}