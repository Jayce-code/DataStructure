package DataStructure.exercise.double_pointer;

import java.util.Arrays;

/**
 *双指针：
 * 给定一个非递减数组num，将他每个数据的平方存到新数组中并返回，要求新数组也是非递减。
 */
public class Test01 {

    public static int[] sortedSquares(int[] nums){
        int n = nums.length;
        int[] target = new int[n];
        for (int i = 0,j = n-1,t = n-1;i <= j;){
            if (nums[i] * nums[i] > nums[j]*nums[j]){
                target[t] = nums[i] * nums[i];
                i++;
            }else {
                target[t] = nums[j] * nums[j];
                j--;
            }
            t--;
        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,6};
        int[] ints = sortedSquares(nums);
        System.out.println(Arrays.toString(ints));
    }
}
