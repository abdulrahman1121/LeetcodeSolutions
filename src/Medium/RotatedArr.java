package Medium;

// Find target in a rotated array.
public class RotatedArr {
    int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        // if pivot is -1, the array isn't rotated, so do a normal binary search.
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        } else {
            // we have a pivot here, so search the 2 asc arrays around it
            if (arr[pivot] == target) {
                return pivot;
            }
            if (target >= arr[0]) {
                return binarySearch(arr, target, 0, pivot - 1);
            }
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }
    }

    int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            //ascending order
            if(target > arr[mid]) {
                start = mid + 1;
            } else if(target < arr[mid]) {
                end = mid - 1;
            } else {
                //answer found
                return mid;
            }
        }
        return -1;
    }

     int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            // 4 case here

            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if(arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
