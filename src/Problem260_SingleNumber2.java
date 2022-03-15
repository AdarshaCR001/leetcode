import java.util.HashSet;
import java.util.Set;

public class Problem260_SingleNumber2 {
    public int[] singleNumber(int[] nums) {
        Set<Integer> unique=new HashSet<>();
        for(int i:nums){
            if(unique.contains(i)){
                unique.remove(i);
            }else{
                unique.add(i);
            }
        }
        int[] result=new int[2];
        int i=-1;
        for(int j:unique){
            result[++i]=j;
        }
        return result;
    }
}
