/**
 * @author WYZ
 * @creat 2021-07-20 21:20
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] arr1 = twoSum(arr,target);
        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i]+" ");
        }
    }

    private static int[] twoSum(int[] arr, int target) {
        int left = 0,right = arr.length-1;
        while(left < right){
            int sum = arr[left] + arr[right];
            if( sum < target){
                left++;
            }else if(sum > target){
                right--;
            }else{
                return new int[] {arr[left],arr[right]};
            }
        }
        return new int[0];
    }
}
