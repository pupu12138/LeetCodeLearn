/**
 * @author WYZ
 * @creat 2021-07-19 20:56
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 18, 20, 0, 3,5,4,17};
        quickSort(arr, 0, arr.length - 1);
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    private static void quickSort(int[] arr, int left, int right) {
        if(right<left){
            return;
        }
        int left0 = left, right0 = right;
        int baseNum = arr[left0];
        while (left != right) {
//            右边找基准数小的
            while (arr[right] >= baseNum && right > left) {
                right--;
            }
//            左边开始比基准数大
            while (arr[left] <= baseNum && right>left) {
                left++;
            }
//            交换位置
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        int temp = arr[left];
        arr[left] = arr[left0];
        arr[left0] = temp;
        quickSort(arr, left0, left-1);
        quickSort(arr,left+1,right0);
    }
}
