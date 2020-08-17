public class Problem11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int area = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int l = 0;
                int b = j - i;

                if (height[i] > height[j]) {
                    l = height[j];
                } else {
                    l = height[i];
                }

                if (area < (l * b)) {
                    area = l * b;
                }

            }
        }
        return area;
    }
}
