import java.util.HashSet;
import java.util.Set;

public class Problem771_JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> unique = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            unique.add(jewels.charAt(i));
        }

        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (unique.contains(stones.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
