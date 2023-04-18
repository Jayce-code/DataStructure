package DataStructure.course.day411;

import java.util.Arrays;

/**
 * 桶排序中的基数排序
 */
public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,2,4,6,8,2,24,48,37,26,54,24,45};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void radixSort(int[] arr){
        if (arr == null || arr.length < 2) return;
        radixSort(arr,0,arr.length -1,maxbits(arr));
    }
    public static void radixSort(int[] arr,int L,int R,int digit){
        final int radix = 10;
        int i = 0,j = 0;
        //有多少数就准备多少空间
        int[] bucket = new int[R - L + 1];

        for (int d = 1; d <= digit; d++){
            /**
             * 10个空间
             * count【0】表示当前位(d位) 是0的数字有多少个
             * count【1】表示当前位(d位) 是1的数字有多少个
             * count【2】表示当前位(d位) 是2的数字有多少个
             * count【i】表示当前位(d位) 是i的数字有多少个
             */

            int[] count = new int[radix];//[0...9]
            for (i = L; i <= R; i++){
                j = getDigit(arr[i],d);
                count[j]++;
            }
            for (i = 1 ;i < radix; i++){
                count[i] +=count[i -1];
            }
            for (i = R ;i >= L;i--){
                j = getDigit(arr[i],d);
                bucket[count[j]-1] = arr[i];
                count[j]--;
            }
            for (i = L,j = 0;i <= R;i++,j++){
                arr[i] = bucket[j];
            }
        }
    }

    public static int maxbits(int[] arr){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++){
            max = Math.max(max,arr[i]);
        }
        int res = 0;

        while (max != 0 ){
            res++;
            max /= 10;
        }
        return res;
    }


    public static int getDigit(int x, int d){
        return ((x /((int)Math.pow(10,d-1))) % 10);
    }
}
