public class Problem42_TrappingRainWater {
    public int trap(int[] height) {
        int total = 0;
        for (int i = 0; i < height.length; i++) {
            int start = 0;
            int end = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (height[j] > start) {
                    start = height[j];
                }
            }
            for (int j = i + 1; j < height.length; j++) {
                if (height[j] > end) {
                    end = height[j];
                }
            }
            int tank = start < end ? start : end;
            if (tank > height[i]) {
                total += tank - height[i];
            }
        }
        return total;
    }
}
