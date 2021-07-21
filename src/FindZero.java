/**
 * @author WYZ
 * @creat 2021-07-21 8:20
 */
public class FindZero {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 3, 12};
        finZero(arr);
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    private static void finZero(int[] arr) {
        if (arr == null) {
            return;
        }
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0 ){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j++] = tmp;
            }
        }
    }
}
