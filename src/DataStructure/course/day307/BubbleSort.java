package DataStructure.course.day307;


public class BubbleSort {
    /**
     * 冒泡排序 0-N的范围上 每次循环n-1  比较相邻两个数  谁大谁靠右
     * @param a
     */
    public static void bubbleSort(int[] a){
        if (a == null ||a.length <2  ){
            return;
        }

        for (int e = a.length-1 ;e >0 ; e--){
            for (int i = 0;  i < e ; i++){
                if (a[i] >a[i+1]){
                    swap(a,i,i+1);
                }
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = { 1,9,5,6,8,7 };
        bubbleSort(a);
        for (int b: a) {
            System.out.println(b);
        }

    }
}
