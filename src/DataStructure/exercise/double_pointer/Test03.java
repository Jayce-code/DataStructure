package DataStructure.exercise.double_pointer;

import java.util.Arrays;

/**
 * 给定一个数组nums,将所有0放到数组末尾，相对顺序保持不变。
 */
public class Test03 {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroesTwo(nums);
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0;i< nums.length;i++){
            if ( nums[i] != 0 ){
                int temp = nums[i] ;
                nums[i] = nums[j];
                nums[j++] = temp;
            }
        }
    }

    public static void moveZeroesTwo(int[] nums){
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] !=0){
                nums[j] = nums[i];
                j++;
            }
        }
        for (;j < nums.length ;j++){
            nums[j] = 0;
        }
    }
}
