package Easy;

// guess the number between 0 and n.
public class guessNumber {
    int guessNum(int n) {
        int start = 0;
        int end = n;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            int guess = guess(mid);
            if(guess == -1) {
                end = mid - 1;
            } else if(guess == 1) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // this is not the actual method, just to not have errors
    int guess(int n) {
        return 0;
    }
}
