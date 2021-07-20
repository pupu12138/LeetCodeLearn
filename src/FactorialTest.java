/**
 * @author WYZ
 * @creat 2021-07-20 9:50
 */
public class FactorialTest {
    public static void main(String[] args) {
        int sum = getSum(100);
        System.out.println(sum);
    }


    private static int getSum(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i+getSum(i-1);
        }
    }
}
