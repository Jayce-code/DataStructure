package DataStructure.exercise.double_pointer;

import java.util.Arrays;

/**
 * 翻转字符串，给定一个字符数组a，将其翻转。
 */
public class Test05 {

    public static void main(String[] args) {
         char[] str = {'h','e','l','l','o'};
         strFlip(str);
        System.out.println("Arrays.toString(str) = " + Arrays.toString(str));
    }

    public static void strFlip(char[] str){
        int n = str.length;
        int left = 0;
        int right = n-1;

        while(left < right){
            char a = str[left];
            str[left] = str[right];
            str[right] = a;
            left++;
            right--;
        }
    }
}
