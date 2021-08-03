import java.util.HashSet;
import java.util.Set;

/**
 * @author WYZ
 * @creat 2021-08-04 0:55
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2, 3, 4, 5};
        boolean etc = containsDuplicate(nums);
        System.out.println(etc);
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for (int num : nums) {
            if (!hs.add(num)) {
                return true;
            }
        }return false;
    }
}
