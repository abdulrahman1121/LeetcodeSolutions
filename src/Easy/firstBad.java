package Easy;

public class firstBad {
    int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int ans = 0;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(isBadVersion(mid)) {
                end = mid - 1;
                ans = mid;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    //Not real method, just to avoid errors
    boolean isBadVersion(int num) {
        if(num * 2 == 6) {
            return true;
        } else {
            return false;
        }
    }
}
