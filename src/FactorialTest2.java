/**
 * @author WYZ
 * @creat 2021-07-20 10:11
 */
public class FactorialTest2 {
    public static void main(String[] args) {
        long fac = getFc(20);
        System.out.println(fac);
    }

    private static long getFc(long i) {
        if (i == 1) {
            return 1;
        } else {
            return i * getFc(i - 1);
        }
    }
}
