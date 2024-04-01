package Easy;

import java.util.HashMap;

// LC 1346
public class nAndDouble {

    boolean checkIfExist(int[] arr) {
        //brute force solution
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(i != j  && arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }
        //return false;

        // Use hashmap
        // arr = [10,2,5,3]
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            numMap.put(arr[i], i);
        }
        for(int i = 0; i < arr.length; i++) {
            // Second condition is for cases where we have 0 as an element
            if(numMap.containsKey(arr[i] * 2) && i != numMap.get(arr[i] * 2)) {
                return true;
            }
        }
        return false;
    }
}
