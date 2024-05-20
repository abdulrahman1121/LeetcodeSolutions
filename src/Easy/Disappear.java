package Easy;

import java.util.ArrayList;
import java.util.List;

class Disappear {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        // Cycle Sort: Intuition -> range [1, n]
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
                list.add(index + 1);
            }
        }

        return list;
    }

    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}