/**
 * @author WYZ
 * @creat 2021-07-20 10:28
 */
public class SortedSquares {
    public static void main(String[] args) {
        int[] arr = {-4, -2, 0, 1, 3, 10};
        int[] newArr=getNewArr(arr);
        for (int value : newArr) {
            System.out.println(value);
        }
    }

    private static int[] getNewArr(int[] arr) {
        int n = arr.length;
        int[] newArr = new int[n];
        for (int i = 0, j = n - 1, tag = n - 1; i <= j; ) {
            if (arr[i] * arr[i] > arr[j] * arr[j]) {
                newArr[tag] = arr[i]*arr[i];
                ++i;
            } else {
                newArr[tag] = arr[j]*arr[j];
                --j;
            }
            --tag;
        }
        return newArr;
    }
}
