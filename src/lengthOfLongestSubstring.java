/**
 * @author WYZ
 * @creat 2021-07-24 20:36
 */
public class lengthOfLongestSubstring {
    public int LengthOfLongestSubstring(String s) {
        int maxSize = 0;
        int[] dict = new int[256];
        int base = 0;
        int key = 0;
        int i = 0;
        while (key < s.length()) {
            i = s.charAt(key);
            if (dict[i] > base)
                base = dict[i];
            dict[i] = key + 1;
            maxSize = (maxSize > key - base + 1) ? maxSize : key - base + 1;
            key++;
        }
        return maxSize;
    }
}

