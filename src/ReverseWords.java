/**
 * @author WYZ
 * @creat 2021-07-22 16:11
 */
public class ReverseWords {
    public static void main(String[] args) {
        String s = new String("Let's take LeetCode contest");
        String s1 = reverseWords(s);
        System.out.println(s1);
    }

    private static String reverseWords(String s) {
        char[] array = s.toCharArray();
        int start = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                reverse(array, start, i - 1);
                start = i + 1; // 更新start为下一个单词的左索引
                continue;
            }
            if (i == array.length - 1) {
                reverse(array, start, i);
            }
        }
        return new String(array);
    }

    private static void reverse(char[] array, int start, int end) {
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start += 1;
            end -= 1;
        }
    }
}

