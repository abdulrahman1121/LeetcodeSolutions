package Medium;

class findDuplicate {
    public int findNum(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }
            else if(nums[i] != i + 1){
                return nums[i];
            } else {
                i++;
            }
        }
        return -1;

    }

    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}