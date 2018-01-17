public class Solution {
  public int[] search(int[][] matrix, int target) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return new int[] {-1, -1};
    }
    int left = 0;
    int right = matrix.length * matrix[0].length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      int row = mid / matrix[0].length;
      int col = mid % matrix[0].length;
      if (matrix[row][col] == target) return new int[] {row, col};
      else if (matrix[row][col] > target) right = mid - 1;
      else left = mid + 1;
    }
    return new int[] {-1, -1};
  }
}
