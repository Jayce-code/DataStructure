package DataStructure.exercise.double_pointer;


import java.util.Arrays;

/**
 * 数组翻转，给定一个数组nums和整数k，将数组中的元素向右移动k个位置，其中
 */
public class Test02 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        rotate(nums,1);
        rotateTwo(nums,1);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums,int k){
        int i = 0;
        int n = nums.length;
        int[] target = new int[n];
        for ( i = 0; i < n; i++){
            target[(i + k)%n] = nums[i];
        }
        System.arraycopy(target,0,nums,0,n);
    }

    public static void rotateTwo(int[] nums, int k){
        k %= nums.length;
        int n = nums.length;
        reverse(nums,0,n-1);
        reverse(nums,0,k - 1);
        reverse(nums,k,n-1);
    }
    public static void reverse(int[] target,int start,int end){
        while( start < end ){
            int temp = target[start];
            target[start] = target[end];
            target[end] = temp;
            start += 1;
            end -= 1;
        }
    }

}
