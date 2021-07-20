/**
 * @author WYZ
 * @creat 2021-07-20 20:30
 */
public class MinRotationArray {
    public static void main(String[] args) {
//        This problem is based on the rotation array as the premise,
//        in the previous code RotationArray has been given,
//        Repeat, the following use of the given rotation array,
        int[] arr = {3, 4, 5, 1, 2};
        int i = minArray(arr);
        System.out.println(i);
    }

    private static int minArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start+(end-start)/2;
            if (arr[mid]<arr[end]){
                end = mid;
            } else if (arr[mid]>arr[end]){
                start = mid + 1;
            }else{
                end -= 1;
            }
        }
        return arr[start];
    }
}
