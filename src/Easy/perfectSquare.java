package Easy;

// Determine whether given num is a perfect square or not
public class perfectSquare {
    boolean isPerfectSquare(int num) {
        int ans = findSquare(num);
        return ans * ans == num;
    }

    int findSquare(int num) {
        int start = 0;
        int end = Math.min(num, (int) Math.sqrt(Integer.MAX_VALUE));

        while(start <= end) {
            int mid = start + (end - start) / 2;
            int square = mid * mid;
            if(square > num) {
                end = mid -1;
            } else if(square < num) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
