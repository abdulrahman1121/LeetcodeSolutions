package Easy;

// find square root of integer x.
public class squareRoot {
    int findNum(int x) {
        int start = 0;
        // this line ensures that end is set to a value that is either x or the square root of the
        // largest possible integer value in Java, whichever is smaller.
        // This helps prevent potential overflow issues during calculations
        int end = Math.min(x, (int) Math.sqrt(Integer.MAX_VALUE));

        while(start <= end) {
            int mid = start + (end - start) / 2;
            int square = mid * mid;
            if(square > x) {
                end = mid - 1;
            } else if(square < x) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
