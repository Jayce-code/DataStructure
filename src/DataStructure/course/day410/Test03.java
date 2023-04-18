package DataStructure.course.day410;

import java.util.Arrays;

/**
 * 堆排序
 */
public class Test03 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,2,4,6,8};
        heapSort(arr);

//        for (int i = 0 ; i < arr.length ; i++){
//            heapInsert(arr,i);
//        }



        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] arr){
        if (arr == null || arr.length <2) return;
        //使数组成为大根堆
        for (int i = 0 ; i < arr.length ; i++){
            heapInsert(arr,i);
        }
        //交换头结点的数到最后一位
        int heapSize = arr.length;
        swap(arr,0,--heapSize);
        while ( heapSize > 0){
            //堆化数组
            heapify(arr,0,heapSize);
            //交换
            swap(arr,0,--heapSize);
        }

    }

    private static void heapify(int[] arr, int index, int heapSize) {
        int left = index * 2 + 1 ;
        while ( left < heapSize){// 孩子下标不越界  就一直比较
            //左右孩子比较
            //这里不能写成  ：arr[left] > arr[left + 1] ? left : left + 1  有可能右孩子下标越界
            int largest = left + 1 < heapSize && arr[left] < arr[left + 1] ? left + 1: left ;
            //孩子与父亲比较
            largest = arr[index] > arr[largest] ? index : largest;
            if (largest == index) break;

            swap(arr,index,largest);
            index = largest;
            left = index * 2 + 1;
        }
    }

    //插入一个数 保持大根堆
    private static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index-1)/2]){
            swap(arr,index,(index - 1)/2);
            index = (index - 1 ) / 2;
        }
    }

    //swap
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
