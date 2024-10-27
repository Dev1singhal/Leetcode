class Solution {
    public int countSquares(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int count = 0;
        int arr[][] = new int[r][c];
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 1) {
                    if (i == 0 || j == 0) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = Math.min(Math.min(arr[i - 1][j], arr[i][j - 1]), arr[i - 1][j - 1]) + 1;
                    }
                }
                count += arr[i][j];
            }
        }
        return count;
    }
}
