/**
 * @author WYZ
 * @creat 2021-07-19 20:31
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4, 6};
//        创建数组
//        为了让索引不超过范围-1。
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                IfModule(arr, j);
            }
            arrPrint(arr);
        }
    }

    private static void IfModule(int[] arr, int j) {
        if (arr[j] > arr[j + 1]) {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }
    }

    private static void arrPrint(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
