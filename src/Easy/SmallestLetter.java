package Easy;

// LeetCode #744, find the smallest character in letters that's greater than target
public class SmallestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        if(target >= letters[end]) {
            return letters[0];
        }

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target >= letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start];
    }
}

