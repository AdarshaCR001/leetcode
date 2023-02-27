public class Problem55_JumpGame {
    public boolean canJump(int[] nums) {
        boolean jumpPosible = true;
        int maxJump = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i + nums[i] > maxJump) {
                maxJump = i + nums[i];
            }
            if (maxJump <= i) {
                jumpPosible = false;
            }
            if (maxJump > nums.length - 2) {
                break;
            }
        }
        return jumpPosible;
    }
}
