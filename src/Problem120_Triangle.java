import java.util.List;

public class Problem120_Triangle {
    int solution = Integer.MAX_VALUE;
    List<List<Integer>> triangle;
    Integer[][] memo;

    public int minimumTotal(List<List<Integer>> triangle) {
        this.triangle = triangle;
        int n = triangle.size();
        memo = new Integer[n][n];
        return minimumTotal(0, 0);
    }

    private int minimumTotal(int i, int j) {
        if (memo[i][j] != null) {
            return memo[i][j];
        }
        int pathSum = triangle.get(i).get(j);
        if (i < triangle.size() - 1) {
            pathSum += Math.min(minimumTotal(i + 1, j), minimumTotal(i + 1, j + 1));
        }
        memo[i][j] = pathSum;
        return memo[i][j];
    }
}
