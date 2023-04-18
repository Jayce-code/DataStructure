package DataStructure.course.day307;


/**
 * 插入排序
 */
public class InsertSort {

    public static void insertSort(int[] a){
        if (a==null || a.length <2){
            return;
        }

        //0-0有序的
        //0~i想有序

        for(int i = 1 ; i < a.length; i++){
            for (int j = i -1; j >=0 && a[j] >a[j+1];j--){   //j从i的前一位开始,如果j位置大于后面一位的数,就交换
                swap(a,j,j+1);
            }
        }

    }

    public static void swap(int[] a,int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5,1,3,2,6,9,7,8};
        insertSort(arr);
        for (int i = 0 ; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
