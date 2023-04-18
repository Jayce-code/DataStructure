package DataStructure.exercise.binary_search;


/**
 * 二分查找练习题1：
 * 给定一个数组nums,和目标数target 如果nums中存在target，则返回下标，否则返回-1；
 */
public class Test01 {
    public static int search(int[] nums, int target){
        int left = 0;
        int right = nums.length -1;
        int mid = left + (right -left)/2;
        while (left <= right){
            mid = left + (right -left)/2;
            if (nums[mid] > target){
                right = mid -1;
            }else if (nums[mid] < target){
                left = mid + 1;
            }else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5,6,7,8,9};
        int search = search(nums, 10);
        System.out.println("search = " + search);
    }
}
