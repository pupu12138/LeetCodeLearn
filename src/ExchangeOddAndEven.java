/**
 * @author WYZ
 * @creat 2021-07-30 15:05
 */
public class ExchangeOddAndEven {
//    未给出子方法；
    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left<right){
            if(nums[left]%2==1){
                left++;
            }else{
                int temp =nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
            }
        }
        return nums;
    }
}
