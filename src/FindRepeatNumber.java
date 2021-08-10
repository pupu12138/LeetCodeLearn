import java.util.HashSet;
import java.util.Set;

/**
 * @author WYZ
 * @creat 2021-08-11 0:12
 */
public class FindRepeatNumber {
    class Solution {
        public int findRepeatNumber(int[] nums) {
            Set<Integer> dic = new HashSet<>();
            for (int num : nums) {
                if (dic.contains(num))
                    return num;
                dic.add(num);
            }
            return -1;
        }
    }
}
