package DataStructure.exercise.binary_search;


/**
 * 二分查找练习题2：
 *给定一个数组nums和目标数target，如果nums中存在target则返回下标，不存在则返回按序插入的位置。
 */
public class Test02 {

    public static int searchInsert(int[] nums,int target){
        int left = 0;
        int right = nums.length -1;
        int mid = left + (right - left) /2;
        while (left <= right){
            mid = left + (right - left) /2;

            if (nums[mid] < target){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int i = searchInsert(nums, 10);
        System.out.println("i = " + i);
    }
}
