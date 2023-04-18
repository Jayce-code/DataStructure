package DataStructure.exercise.double_pointer;

import java.util.Arrays;

/**
 * 给定一个数组nums和目标数target、返回和等于target的两个数的下标，nums为非递减数列。
 */
public class Test04 {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,7,8};
        int[] ints = twoNumbersSum(a, 12);
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));
    }
    public static int[] twoNumbersSum(int[] nums,int target){
        int n = nums.length;
        int left = 0;
        int right = n -1;
        while (left < right){
            if (nums[left] + nums[right] < target) left++;
            if (nums[left] + nums[right] > target) right++;
            if (nums[left] + nums[right] == target){
                return new int[]{left+1,right+1};
            }
        }
        return new int[]{0,0};
    }
}
