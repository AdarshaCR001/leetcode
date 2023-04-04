public class Problem240_SearchA2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = -1;
        int n = -1;
        for (int i = 0; i < matrix.length; i++) {
            if (target >= matrix[i][0]) {
                m = i + 1;
            }
        }
        for (int j = 0; j < matrix[0].length; j++) {
            if (target >= matrix[0][j]) {
                n = j + 1;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (target == matrix[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
