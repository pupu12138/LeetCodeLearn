/**
 * @author WYZ
 * @creat 2021-07-20 15:05
 */
public class RotationArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7};
        int k = 3;
        rotate(arr, k);
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    private static void rotate(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }

    private static void reverse(int[] arr, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }
}
