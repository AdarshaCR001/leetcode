import java.util.HashMap;
import java.util.Map;

public class Problem169_MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int length=nums.length;
        for(int i=0;i<length;i++){
            if(map.containsKey(nums[i])){
                int count=map.get(nums[i])+1;
                if(count>length/2){
                    return nums[i];
                }
                map.put(nums[i],count);
            }else{
                map.put(nums[i],1);
            }
        }
        return 1;
    }
}
