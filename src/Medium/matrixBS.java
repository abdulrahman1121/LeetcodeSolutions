package Medium;

public class matrixBS {
        public static void main(String[] args) {
            int[][] arr = {
                    {10, 20, 30, 40},
                    {45, 50, 55, 60},
                    {60, 75, 90, 105}
            };
            int target = 105;
            boolean ans = searchMatrix(arr, target);
            System.out.println(ans);
            //   int[] ans = search(arr, target);
            //   System.out.println(Arrays.toString(ans));
        }

        static int[] search(int[][] arr, int target) {
            // c should be last colum in first row
            int r = 0;
            int c = arr[0].length - 1;

            while(r < arr.length && c >= 0) {
                if(arr[r][c] == target) {
                    return new int[]{r, c};
                }
                if(arr[r][c] > target) {
                    c--;
                } else {
                    r++;
                }
            }
            return new int[]{-1, -1};
        }

        // Using BS
        static boolean searchMatrix(int[][] matrix, int target) {
            int row = searchPotentialRow(matrix, target);
            if(row != -1) {
                return binarySearchOverRow(row, matrix, target);
            }
            return false;
        }

        static int searchPotentialRow(int[][] matrix, int target) {
            int start = 0;
            int end = matrix.length - 1;

            while(start <= end) {
                int mid = start + (end - start) / 2;

                if(matrix[mid][0] <= target && target <= matrix[mid][matrix[0].length - 1]) {
                    return mid;
                } else if(matrix[mid][0] > target) {
                    end = mid - 1;
                } else if(matrix[mid][0] < target){
                    start = mid + 1;
                }
            }
            return -1;
        }

        static boolean binarySearchOverRow(int row, int[][] matrix, int target) {
            int start = 0;
            int end = matrix[row].length - 1;

            while(start <= end) {
                int mid = start + (end - start) / 2;
                if(matrix[row][mid] == target) {
                    return true;
                } else if(matrix[row][mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return false;
        }
}
