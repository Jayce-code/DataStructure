package DataStructure.course.day410;


import java.util.Arrays;

/**
 * 题目：给定一个数组arr和一个数字num，请把小于num的数放在数组左边，大于num的数放在数组右边，
 * 额外空间复杂度O(1),时间复杂度O(n)
 */
public class Test01 {

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,2,4,6,8,5,7,6,8,5,2,6,8,4};
        //functionOne(arr,5);
        functionTwo(arr,5);
        System.out.println(Arrays.toString(arr));
    }
    //左小右大
    public static void functionOne(int[] arr, int num){
        int border = -1;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] <= num){
                swap(arr,i,++border);
            }
        }
    }
    //升级：左小、中间等于、右大
    public static void functionTwo(int[] arr, int num){
        int borderLeft = -1;
        int borderRight = arr.length;
        int i = 0;
        while(i < borderRight){
            if (arr[i] < num){
                swap(arr,i++,++borderLeft);
            }else if (arr[i] == num){
                i++;
            }else {
                swap(arr,i,--borderRight);
            }
        }
    }

    //swap
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
