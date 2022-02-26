public class Problem1232_CheckIfItIsAStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];

        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];
        float m = 0;

        boolean xConstant = false;
        boolean yConstant = false;
        if (x2 == x1) {
            xConstant = true;
        } else if (y2 == y1) {
            yConstant = true;
        } else {
            m = (float) (y2 - y1) / (x2 - x1);
        }
        for (int i = 2; i < coordinates.length; i++) {
            x2 = coordinates[i][0];
            y2 = coordinates[i][1];
            if (xConstant) {
                if (x1 != x2) {
                    return false;
                } else {
                    continue;
                }
            } else if (yConstant) {
                if (y1 != y2) {
                    return false;
                } else {
                    continue;
                }
            }
            float m1 = (float) (y2 - y1) / (x2 - x1);
            if (m != m1) {
                return false;
            }
        }
        return true;
    }
}
