/**
 * @author WYZ
 * @creat 2021-08-11 0:11
 */
public class IsPalindrome {
    class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0) return false;
            String str = x + "";
            int low = 0;
            int high = str.length() - 1;
            while (low < high) {
                if (str.charAt(low) != str.charAt(high)) {
                    return false;
                } else {
                    low++;
                    high--;
                }
            }
            return true;
        }
    }
}
