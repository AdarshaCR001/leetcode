public class Problem162_FindPeakElement {
    public int findPeakElement(int[] nums) {
        int max=0;
        for(int i=1;i<nums.length;i++){
            if(nums[max]<nums[i]){
                max=i;
            }
        }
        return max;
    }
}
