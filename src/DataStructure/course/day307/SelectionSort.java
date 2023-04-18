package DataStructure.course.day307;

/**
 * @program: JavaStudy
 * @author: Badwoman
 * @create: 2022-09-29 14:19
 * @description
 *   选择排序算法
 **/
@SuppressWarnings("all")
public class SelectionSort {

    //test
    public static void main(String[] args) {
            int[] arr = {5,1,3,2,6,9,7,8};

            selectionSort(arr);

            for (int i = 0 ; i < arr.length;i++){
                System.out.println(arr[i]);
            }
    }

    /**
     *遍历数组每次确定一个最小的数 放最左边，下标从0开始
     * @param arr 需要排序的数组
     */
    public static void selectionSort(int[] arr){
        //过滤不合法数据
        if (arr == null || arr.length < 1){
            return;
        }

        for (int i = 0 ; i < arr.length-1; i++){ //0~n-1
            int  minIndex = i;

            for (int j = i + 1; j < arr.length; j++){
                minIndex = arr[j] > arr[minIndex] ? minIndex : j;
            }

            swap(arr,i,minIndex);
        }

    }

    /**
     * 交换目标数组指定下标的值
     * @param arr 目标数组
     * @param i 指定下标1
     * @param j 指定下标2
     */
    public static void swap(int[] arr, int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        /**
         *  arr[i] = arr[i] ^ arr[j];
         *  arr[j] = arr[i] ^ arr[j];
         *  arr[i] = arr[i] ^ arr[j];
         */
    }

}
