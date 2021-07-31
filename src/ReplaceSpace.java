/**
 * @author WYZ
 * @creat 2021-07-31 17:32
 */
public class ReplaceSpace {
    public static void main(String[] args) {
    }

    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if (c == ' ') sb.append("%20");
            else sb.append(c);
        }
        return sb.toString();
    }
}

