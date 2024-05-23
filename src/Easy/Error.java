package Easy;

class Error {
    public int[] findErrorNums(int[] nums) {
        // missing number = index of duplicated number + 1
        // duplicated != i + 1
        int[] arr = new int[2];
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1) {
                arr[0] = nums[index];
                arr[1] = index + 1;
            }
        }
        return arr;
    }

    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
