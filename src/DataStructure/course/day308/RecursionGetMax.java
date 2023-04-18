package DataStructure.course.day308;


/**
 * 递归寻找数组最大值
 */
public class RecursionGetMax {

    public static int getMax(int[] arr){
        return process(arr,0, arr.length-1);
    }

    //求arr[L....R]上的最大值
    public static int process(int[] arr,int L, int R){
        if (arr[L] == arr[R]){
            return arr[L];
        }
        int mid = L+((R-L)>>1); //中点
        int leftMax = process(arr,L,mid);
        int rightMax = process(arr,mid+1,R);
        return Math.max(leftMax,rightMax);
    }

    public static void main(String[] args) {
        int[] arr = {11,22,55,33,44};
        int max = getMax(arr);
        System.out.println("max = " + max);
    }
}
