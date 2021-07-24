import java.util.Arrays;

/**
 * @author WYZ
 * @creat 2021-07-24 21:18
 */
public class CheckInclusion {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len1 > len2) return false;
        int[] ch_count = new int[26];
        for (int i = 0; i < len1; ++i) {
            ++ch_count[s1.charAt(i) - 'a'];
            --ch_count[s2.charAt(i) - 'a'];
        }
        for (int i = len1; i < len2; ++i) {
            if (isEqual(ch_count)) return true;
            ++ch_count[s2.charAt(i - len1) - 'a'];
            --ch_count[s2.charAt(i) - 'a'];
        }
        return isEqual(ch_count);
    }

    private boolean isEqual(int[] ch_count) {
        return Arrays.stream(ch_count).allMatch(count -> count == 0);
    }
}
