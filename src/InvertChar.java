/**
 * @author WYZ
 * @creat 2021-07-22 15:33
 */
public class InvertChar {
    public static void main(String[] args) {
        char[] s = {'H','e','l','l','o'};
        invertChar(s);
        System.out.println(s);
    }

    private static void invertChar(char[] s) {
        for(int left = 0,right = s.length-1;left<right;++left,--right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }
    }
}
