package DataStructure.course.day410;

import java.util.Arrays;

/**
 * 快速排序
 */
public class Test02 {

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,8,9,2,4,6,7,8,10,6,2,34,5,33};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr){
        if ( arr == null || arr.length <2) return;

        quickSort(arr,0,arr.length - 1);
    }
    public static void quickSort(int[] arr,int L, int R){
        if (L < R){
            //随机一个数和最后一个数交换
            swap(arr,L+(int)(Math.random()*(R - L +1)),R);
            int[] p = partition(arr,L,R);
            quickSort(arr,L,p[0]-1); // 小于部分
            quickSort(arr,p[1]+1,R); // 大于部分
        }
    }

    public static int[] partition(int[] arr, int L ,int R){
        int less = L - 1;
        int more = R;
        while ( L < more){
            if (arr[L] < arr[R]){
                swap(arr,++less,L++);
            }else if (arr[L] > arr[R]){
                swap(arr,L,--more);
            }else {
                L++;
            }
        }
        swap(arr,more,R);
        return new int[] {less+1,more};
    }

    public static void swap(int[] arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
