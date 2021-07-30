/**
 * @author WYZ
 * @creat 2021-07-30 15:28
 */
public class TitleToNumber {
    //    未给出方法的主方法
    public int titleToNumber(String columnTitle) {
        int res = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            int num = columnTitle.charAt(i) - 'A' + 1;
            res = res * 26 + num;
        }
        return res;
    }
}
